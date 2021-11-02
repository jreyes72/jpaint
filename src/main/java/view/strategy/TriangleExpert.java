package view.strategy;

import model.interfaces.Region;
import view.interfaces.Shape;

import java.awt.*;

public class TriangleExpert extends DrawExpert{

    private static int NUM_SIDES = 3;

    public static void drawFilled(Graphics2D graphics, view.interfaces.Shape shape) {
        Region region = shape.region();
        graphics.setColor(shape.fillColor());
        int[] x = getXArray(region);
        int[] y = getYArray(region);

        Polygon p = new Polygon(x, y, NUM_SIDES);
        graphics.fillPolygon(p);
    }

    public static void drawBorder(Graphics2D graphics, view.interfaces.Shape shape) {
        Region region = shape.region();
        graphics.setColor(shape.borderColor());
        graphics.setStroke(new BasicStroke(3));
        drawBorder(graphics, region);
    }

    private static void drawBorder(Graphics2D graphics, Region region){
        int[] x = getXArray(region);
        int[] y = getYArray(region);
        Polygon p = new Polygon(x, y, NUM_SIDES);
        graphics.drawPolygon(p);
    }

    public static void drawSelected(Graphics2D graphics, Shape shape) {
        Region region = shape.region();
        graphics.setColor(Color.GRAY);
        graphics.setStroke(dashed);
        Region selectRegion = region.reshape(-3,3);
        drawBorder(graphics, selectRegion);
    }

    private static int[] getYArray(Region region) {
        return new int[]{region.getY(), region.getY() + region.getHeight(), region.getY() + region.getHeight()};
    }

    private static int[] getXArray(Region region) {
        return new int[]{region.getX() + region.getWidth() / 2, region.getX(), region.getX() + region.getWidth()};
    }
}
