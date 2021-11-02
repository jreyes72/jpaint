package view.strategy;

import model.interfaces.Region;
import view.interfaces.BasicDrawer;
import view.interfaces.Shape;

import java.awt.*;

public class EmptyShapeDrawer extends BasicDrawer {

    @Override
    public void drawShape(Graphics2D graphics, Region region) {

    }

    @Override
    public void drawBorder(Graphics2D graphics, Region region) {

    }
}
