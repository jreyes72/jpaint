package model.picture;

import model.ShapeColor;
import model.ShapeType;

public class Triangle extends ShapeImpl{

    public Triangle(Point start, Point end, ShapeColor color) {

        super(start, end, color, ShapeType.TRIANGLE);
    }
}
