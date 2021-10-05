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
    private Picture picture;

    public CreateShapeCommand(UserChoices userChoices, Picture picture, Point start, Point end) {
        this.userChoices = userChoices;
        this.picture = picture;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        Rectangle rect = new Rectangle(start,end,userChoices.getActivePrimaryColor());
        CommandHistory.add(this);
        picture.add(rect);
        System.out.println("running...");
    }

    @Override
    public void undo() {

    }

    @Override
    public void redo() {

    }
}
