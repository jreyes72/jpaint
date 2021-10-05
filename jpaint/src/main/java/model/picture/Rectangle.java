package model.picture;

import java.awt.Graphics;
import model.ShapeColor;
import model.interfaces.Shape;

public class Rectangle implements Shape {
  private Point start;
  private Point end;
  private ShapeColor color;
  private int height;
  private int width;

public Rectangle(Point start, Point end, ShapeColor color) {
  this.start = start;
  this.end = end;
  this.color = color;
  height = Math.abs(start.getY() - end.getY());
  width = Math.abs(start.getX() - end.getX());
}

  @Override
  public void draw(Graphics graphics) {
    graphics.setColor(color.color);
    graphics.fillRect(start.getX(), start.getY(), width,height);
  }
}
