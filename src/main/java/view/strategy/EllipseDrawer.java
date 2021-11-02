/*
 * Assignment: 2
 * Topic: JPaint
 * Author: Dan Walker
 */
package view.strategy;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import model.interfaces.Region;
import view.interfaces.Shape;
import view.interfaces.DrawStrategy;

public class EllipseDrawer implements DrawStrategy {
  @Override
  public void draw(Graphics2D graphics, Shape shape) {
    Region region = shape.region();
    graphics.setColor(shape.fillColor());
    graphics.fill(new Ellipse2D.Double(region.getX(), region.getY(), region.getWidth(), region.getHeight()));
  }
}
