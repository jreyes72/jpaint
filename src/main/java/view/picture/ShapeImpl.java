/*
 * Assignment: 1
 * Topic: JPaint
 * Author: Dan Walker
 */
package view.picture;

import java.awt.Color;
import java.awt.Graphics2D;
//import model.ShapeColor;
import model.interfaces.Region;
import view.interfaces.Shape;
import view.interfaces.DrawStrategy;

/**
 * @see Shape
 */
public class ShapeImpl implements Shape {

  private final Color color;
  private final Color borderColor;
  private final Region region;
  private  DrawStrategy fillStrategy = null;
  private DrawStrategy borderStrategy = null;
  private DrawStrategy selectStrategy = null;

  public ShapeImpl(Region region, Color color, Color borderColor, DrawStrategy fillStrategy, DrawStrategy borderStrategy, DrawStrategy selectStrategy) {
    this.region = region;
    this.color = color;
    this.borderColor = borderColor;
    this.fillStrategy = fillStrategy;
    this.borderStrategy = borderStrategy;
    this.selectStrategy = selectStrategy;
  }
  public ShapeImpl(Region region, Color color, Color borderColor) {
    this.region = region;
    this.color = color;
    this.borderColor = borderColor;
  }

  public Color fillColor() { return color; }

  public Color borderColor() { return borderColor; }

  public Region region() {return region; }

  @Override
  public void draw(Graphics2D graphics) {
    fillStrategy.draw(graphics, this);
    borderStrategy.draw(graphics, this);
  }

  public void move(int x, int y) {
    region.move(x, y);
  }

}
