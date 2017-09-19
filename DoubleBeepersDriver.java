
/**
   @Author:
      Date:
   Teacher: Appel
  */
import kareltherobot.*;
import java.awt.Color;

public class DoubleBeepersDriver implements Directions
{
    public static void main(String args[])  {
        DoubleBot karel = new DoubleBot(1, 1, East, -1);  
        karel.doubleBeepers();
        karel.turnOff();  
    } 

    static {
        World.reset();
        World.setSize(3,4);
        World.placeBeepers(1,2,(int)(Math.random() * 50));
        World.setBeeperColor(Color.black);
        World.setStreetColor(Color.gray);
        World.setNeutroniumColor(Color.black);
        World.setDelay(10);  
        World.setVisible(true);
    }
}
