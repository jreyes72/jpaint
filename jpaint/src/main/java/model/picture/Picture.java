package model.picture;

import java.awt.Graphics;
import model.interfaces.Shape;

public class Picture {

private Rectangle[] rectangles = new Rectangle[10];
private int currRects = 0;

public Picture(){

}

public void draw(Graphics graphics) {
  for (int i = 0; i < currRects; i++){
    rectangles[i].draw(graphics);
  }
}

public void add(Rectangle r){
  if (currRects > 10) {
    rectangles[currRects] = r;
    currRects ++;
  }
}

}
