/*
 * Assignment: 2
 * Topic: JPaint
 * Author: Dan Walker
 */
package controller;

import model.ShapeShadingType;
import view.interfaces.DrawStrategy;

import view.strategy.*;

import java.awt.Color;
import model.ShapeType;

import model.interfaces.Region;
import view.interfaces.Shape;
import view.picture.ShapeImpl;

public class ShapeBuilder {
  private Color fillColor;
  private Color borderColor;
  private ShapeShadingType shading;

  private ShapeType type;
  private Region region;

  public ShapeBuilder setFillColor(Color color) {
    this.fillColor = color;
    return this;
  }

  public ShapeBuilder setBorderColor(Color color) {
    this.borderColor = color;
    return this;
}

  public ShapeBuilder setShadingType(ShapeShadingType shading) {
    this.shading = shading;
    return this;
  }

  public ShapeBuilder setRegion(Region region) {
    this.region = region;
    return this;
  }

  public ShapeBuilder setType(ShapeType type) {
    this.type = type;
    return this;
  }


  public Shape build() {

    DrawStrategy fillStrategy = new NullDrawer();
    DrawStrategy borderStrategy = new NullDrawer();
    DrawStrategy selectStrategy;

    switch (type) {
      case ELLIPSE:
        if (shading == ShapeShadingType.FILLED_IN || shading == ShapeShadingType.OUTLINE_AND_FILLED_IN) {
          fillStrategy = new ShapeDrawer(EllipseExpert::drawFilled);
        }
        if (shading == ShapeShadingType.OUTLINE || shading == ShapeShadingType.OUTLINE_AND_FILLED_IN) {
          borderStrategy = new ShapeDrawer(EllipseExpert::drawBorder);
        }
        selectStrategy = new ShapeDrawer(EllipseExpert::drawSelected);
        break;
      case RECTANGLE:
        if (shading == ShapeShadingType.FILLED_IN || shading == ShapeShadingType.OUTLINE_AND_FILLED_IN) {
          fillStrategy = new ShapeDrawer(RectangleExpert::drawFilled);
        }
        if (shading == ShapeShadingType.OUTLINE || shading == ShapeShadingType.OUTLINE_AND_FILLED_IN) {
          borderStrategy = new ShapeDrawer(RectangleExpert::drawBorder);
        }
        selectStrategy = new ShapeDrawer(RectangleExpert::drawSelected);
        break;
      case TRIANGLE:
        if (shading == ShapeShadingType.FILLED_IN || shading == ShapeShadingType.OUTLINE_AND_FILLED_IN) {
          fillStrategy = new ShapeDrawer(TriangleExpert::drawFilled);
        }
        if (shading == ShapeShadingType.OUTLINE || shading == ShapeShadingType.OUTLINE_AND_FILLED_IN) {
          borderStrategy = new ShapeDrawer(TriangleExpert::drawBorder);
        }
        selectStrategy = new ShapeDrawer(TriangleExpert::drawSelected);
        break;
      default:
        throw new IllegalArgumentException("Unknown ShapeType");
    }

    return new ShapeImpl(region, fillColor, borderColor, fillStrategy, borderStrategy, selectStrategy);
  }
}

