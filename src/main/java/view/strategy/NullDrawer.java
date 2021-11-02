package view.strategy;

import view.interfaces.DrawStrategy;
import view.interfaces.Shape;

import java.awt.*;

public class NullDrawer implements DrawStrategy {
    @Override
    public void draw(Graphics2D graphics, Shape shape) {

    }
}
