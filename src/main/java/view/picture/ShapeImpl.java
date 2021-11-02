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
  private final Region region;
  private  DrawStrategy drawStrategy = null;

  public ShapeImpl(Region region, Color color, DrawStrategy drawStrategy) {
    this.region = region;
    this.color = color;
    this.drawStrategy = drawStrategy;
  }
  public ShapeImpl(Region region, Color color) {
    this.region = region;
    this.color = color;
  }

  public Color fillColor() { return color; }

  public Region region() {return region; }

  @Override
  public void draw(Graphics2D graphics) {
    drawStrategy.draw(graphics, this);
  }

  public void move(int x, int y) {
    region.move(x, y);
  }

}
