package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import controller.command.CommandController;
import model.picture.Point;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * MouseHandler is responsible for propagating mouse coordinates into our application
 * classes. This is a boundary class so very little code should be added here.
 */
public class MouseHandler extends MouseAdapter {

  private static final Logger log = LoggerFactory.getLogger(MouseHandler.class);
  private CommandController commandController;
  private Point start;

  public MouseHandler(CommandController commandController) {
    this.commandController = commandController;
  }

  @Override
  public void mousePressed(MouseEvent e) {
    start = new Point(e.getX(), e.getX());
    log.debug("Start " + e.getX() + " " + e.getY());
  }

  @Override
  public void mouseReleased(MouseEvent e) {
    Point end = new Point(e.getX(), e.getY());
    //log.debug("End " + e.getX() + " " + e.getY());
    commandController.onDraw(start,end);
  }
}
