package view.interfaces;

import model.interfaces.Region;

import java.awt.*;

public abstract class BasicDrawer implements DrawStrategy {
    @Override
    public void draw(Graphics2D graphics, Shape shape){

    }

    public void drawBorder(Graphics2D graphics, Shape shape){

    }

    public abstract void drawShape(Graphics2D graphics, Region region);

    public abstract void drawBorder(Graphics2D graphics, Region region);
}
