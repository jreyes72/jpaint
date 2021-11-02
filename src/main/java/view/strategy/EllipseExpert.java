package view.strategy;

import model.interfaces.Region;
import view.interfaces.Shape;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class EllipseExpert extends DrawExpert{

    public static void drawFilled(Graphics2D graphics, view.interfaces.Shape shape) {
        Region region = shape.region();
        graphics.setColor(shape.fillColor());
        graphics.fill(new Ellipse2D.Double(region.getX(), region.getY(), region.getWidth(), region.getHeight()));
    }

    public static void drawBorder(Graphics2D graphics, view.interfaces.Shape shape) {
        Region region = shape.region();
        graphics.setColor(shape.borderColor());
        graphics.setStroke(new BasicStroke(3));
        drawBorder(graphics, region);
    }

    private static void drawBorder(Graphics2D graphics, Region region){
        graphics.draw(new Ellipse2D.Double(region.getX(), region.getY(), region.getWidth(), region.getHeight()));
    }

    public static void drawSelected(Graphics2D graphics, Shape shape) {
        Region region = shape.region();
        graphics.setColor(Color.GRAY);
        graphics.setStroke(dashed);
        Region selectRegion = region.reshape(-3,3);
        drawBorder(graphics, selectRegion);
    }
}
