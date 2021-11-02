package model.picture;


import model.ShapeColor;
import model.ShapeType;

public class Ellipse extends ShapeImpl {

    public Ellipse(Point start, Point end, ShapeColor color) {
        super(start, end, color, ShapeType.ELLIPSE);
    }
}
