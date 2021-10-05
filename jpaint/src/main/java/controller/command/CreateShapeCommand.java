package controller.command;

import controller.interfaces.Command;
import controller.interfaces.Undoable;
import model.interfaces.UserChoices;
import model.picture.Picture;
import model.picture.Point;
import model.picture.Rectangle;

public class CreateShapeCommand implements Command, Undoable {

    private Point start;
    private Point end;
    private UserChoices userChoices;

    public CreateShapeCommand(UserChoices userChoices, Point start, Point end) {
        this.userChoices = userChoices;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        Rectangle rect = new Rectangle(start,end,userChoices.getActivePrimaryColor());
        CommandHistory.add(this);
        Picture p = new Picture();
        p.add(rect);
        System.out.println("running...");
    }

    @Override
    public void undo() {

    }

    @Override
    public void redo() {

    }
}
