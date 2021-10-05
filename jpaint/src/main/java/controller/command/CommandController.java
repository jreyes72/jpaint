package controller.command;

import controller.interfaces.Command;
import model.interfaces.UserChoices;
import model.picture.Point;
import view.gui.PaintCanvas;

public class CommandController {

    private UserChoices userChoices;

    public CommandController(UserChoices userChoices){
        this.userChoices = userChoices;
    }

    public void onDraw(Point start, Point end) {
        Command command = new CreateShapeCommand(userChoices, start, end);
        command.run();
        PaintCanvas p = new PaintCanvas();
        p.repaint();
    }
}
