/*
 * Assignment: 2
 * Topic: JPaint
 * Author: Dan Walker
 */
package controller.command;

import controller.interfaces.Command;
import controller.interfaces.Undoable;
import java.util.List;
import model.interfaces.Region;
import view.interfaces.Shape;
import view.interfaces.Picture;

public class MoveShapesCommand  implements Command, Undoable {
  private List<Shape> movedShapes;
  private int deltaX;
  private int deltaY;
  private final Region region;
  private final Picture picture;

  public MoveShapesCommand(Picture picture, Region region) {
    this.region = region;
    this.picture = picture;

    CommandHistory.add(this);
  }
  @Override
  public void run() {
    movedShapes = picture.getSelected();
    deltaX = region.getDeltaX();
    deltaY = region.getDeltaY();
    moveShapes(deltaX, deltaY);
  }

  private void moveShapes(int dx, int dy) {
    for (Shape shape : movedShapes) {
      shape.move(dx, dy);
    }
  }

  @Override
  public void undo() {
    moveShapes(deltaX * -1, deltaY * -1);
  }

  @Override
  public void redo() {
    moveShapes(deltaX, deltaY);
  }
}

