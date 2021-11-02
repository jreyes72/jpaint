/*
 * Assignment: 1
 * Topic: JPaint
 * Author: Dan Walker
 */
package view.strategy;

import java.awt.Graphics2D;
import model.interfaces.Region;
import view.interfaces.Shape;

import view.interfaces.DrawStrategy;

public class ShapeDrawer implements DrawStrategy {

  public ShapeDrawer(DrawStrategy drawStrategy) {

  }

  @Override
  public void draw(Graphics2D graphics, Shape shape) {
    Region region = shape.region();
    graphics.setColor(shape.fillColor());
    graphics.fillRect(region.getX(), region.getY(), region.getWidth(), region.getHeight());
  }
}
