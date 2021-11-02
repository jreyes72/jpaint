package model.picture;

import model.ShapeColor;
import model.ShapeType;

public class Rectangle extends ShapeImpl{


    public Rectangle(Point start, Point end, ShapeColor color) {
        super(start, end, color, ShapeType.RECTANGLE);
    }
}
