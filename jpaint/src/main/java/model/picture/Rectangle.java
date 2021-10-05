package model.picture;

import model.interfaces.Shape;

public class Rectangle implements Shape {
  private Point start;
  private Point end;
  private int color;
  private int height;
  private int width;

public Rectangle(Point start, Point end, int color) {
  this.start = start;
  this.end = end;
  this.color = color;
  height = start.getY() - end.getY();
  width = start.getX() - end.getX();
}

  @Override
  public void build() {

  }
}
