package controller.command;

import controller.interfaces.Command;
import controller.interfaces.Undoable;
import view.interfaces.Picture;
import model.interfaces.Region;
import view.interfaces.Shape;

import java.awt.*;
import java.util.List;

public class CopyShapesCommand implements Command, Undoable {

    private List<Shape> copiedShapes;
    private final Region region;
    private final Picture picture;
    private final Graphics2D graphics;

    public CopyShapesCommand(Region region, Picture picture, Graphics2D graphics){
        this.region = region;
        this.picture = picture;
        this.graphics = graphics;

        CommandHistory.add(this);
    }

    @Override
    public void run() {
        copiedShapes = picture.getSelected();

    }

    public void pasteShapes(){
        for (Shape shape : copiedShapes) {
            shape.draw(graphics);
        }
    }

    @Override
    public void undo() {

    }

    @Override
    public void redo() {

    }
}
