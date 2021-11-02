package model.interfaces;

import model.ShapeType;

import java.awt.Graphics2D;

/**
 * Represents an individual shape drawn by the user.
 */
public interface Shape {
  void draw(Graphics2D graphics);
}
