package controller.command;

import controller.interfaces.Command;
import controller.interfaces.Undoable;
import view.gui.PaintCanvas;
import view.interfaces.Picture;
import view.interfaces.Shape;

import java.util.ArrayList;
import java.util.List;

public class DeleteShapesCommand implements Command, Undoable {
    private final Picture picture;
    private final PaintCanvas canvas;


    private List<Shape> deletedShapes = new ArrayList<>();

    public DeleteShapesCommand(Picture picture, PaintCanvas canvas) {
        this.picture = picture;
        this.canvas = canvas;
        CommandHistory.add(this);
    }

    @Override
    public void undo() {
        for (Shape s : deletedShapes){
            picture.add(s);
        }
        System.out.println("undid delete");
    }

    @Override
    public void redo() {
        picture.remove(deletedShapes);
    }

    @Override
    public void run() {
        List<Shape> selected = picture.getSelected();
        for (Shape s : selected) {
            deletedShapes.add(s);
        }
        picture.remove(deletedShapes);
    }
}
