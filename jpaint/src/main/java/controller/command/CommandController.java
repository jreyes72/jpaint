package controller.command;

import model.picture.Point;

public class CommandController {
    public void onDraw(Point start, Point end) {
        System.out.print(start + " " + end);
    }
}
