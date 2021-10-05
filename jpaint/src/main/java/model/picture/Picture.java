package model.picture;

import model.interfaces.Shape;

public class Picture {

private Rectangle[] rectangles = new Rectangle[10];
private int currRects = 0;

public Picture(){

}

public void add(Rectangle r){
  rectangles[currRects] = r;
}

}
