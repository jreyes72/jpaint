/*
 * Assignment: 2
 * Topic: JPaint
 * Author: Dan Walker
 */
package view.strategy;

import java.awt.Graphics2D;
import java.awt.Polygon;
import model.interfaces.Region;
import view.interfaces.Shape;
import view.interfaces.DrawStrategy;

public class TriangleDrawer implements DrawStrategy {

  private final int NUM_SIDES = 3;

  @Override
  public void draw(Graphics2D graphics, Shape shape) {
    Region region = shape.region();
    graphics.setColor(shape.fillColor());
    int[] x = getXArray(region);
    int[] y = getYArray(region);

    Polygon p = new Polygon(x, y, NUM_SIDES);
    graphics.fillPolygon(p);
  }

  private int[] getYArray(Region region) {
    return new int[]{region.getY(), region.getY() + region.getHeight(), region.getY() + region.getHeight()};
  }

  private int[] getXArray(Region region) {
    return new int[]{region.getX() + region.getWidth() / 2, region.getX(), region.getX() + region.getWidth()};
  }
}
