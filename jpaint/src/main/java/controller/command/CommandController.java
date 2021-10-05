package controller.command;

import controller.interfaces.Command;
import model.interfaces.UserChoices;
import model.picture.Picture;
import model.picture.Point;
import view.gui.PaintCanvas;

public class CommandController {

    private UserChoices userChoices;
    private Picture picture;
    private PaintCanvas paintCanvas;

    public CommandController(UserChoices userChoices, Picture picture, PaintCanvas paintCanvas) {
        this.userChoices = userChoices;
        this.picture = picture;
        this.paintCanvas = paintCanvas;
    }

    public void onDraw(Point start, Point end) {
        Command command = new CreateShapeCommand(userChoices, picture, start, end);
        command.run();
        paintCanvas.repaint();
    }
}
