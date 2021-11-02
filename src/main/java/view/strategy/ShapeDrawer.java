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

  private DrawStrategy drawStrategy;

  public ShapeDrawer(DrawStrategy drawStrategy) {
    this.drawStrategy = drawStrategy;
  }

  @Override
  public void draw(Graphics2D graphics, Shape shape) {
    Region region = shape.region();
    graphics.setColor(shape.fillColor());
    drawStrategy.draw(graphics,shape);
  }
}
