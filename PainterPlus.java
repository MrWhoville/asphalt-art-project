import org.code.neighborhood.*;

public class PainterPlus extends Painter {

  // Turns the Painter to the right
  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }

  // Paints a diagonal spot based on what direction the Painter is facing
    public void paintDiagonal (String color){
      turnRight();
      move();
      paint(color);
      turnLeft();
  
  }
  // Paints a dot and moves one spot if Painter wasnt on a spot already but if so the painter moves then paint//
    public void movePaint (String color){
  if (isOnPaint()){
      move();
      paint(color);
  }
  else {
      paint(color);
      move();
   }
 }  

// Moves the Painter forward until it reaches a spot without paint present
public void moveToEmpty(){
  while (isOnPaint()){
    move();
  }
}

// Turns the Painter to the West
public void turnWest (){
  while (!isFacingWest()){
    turnLeft();
  }
}

//Turns the Painter to the South
  public void turnSouth (){
  while (!isFacingSouth()){
    turnLeft();
  }
 }

// Turns the painter to the North
  public void turnNorth(){
    while (!isFacingNorth()){
      turnLeft();
    }
  }
}

