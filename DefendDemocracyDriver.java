
/**
   @Author:
      Date:
   Teacher: Appel
  */
import kareltherobot.*;
import java.awt.Color;

public class DefendDemocracyDriver implements Directions
{
    public static void main(String args[])  {
        DemocracyBot karel = new DemocracyBot(3, 1, East, 0);  
        karel.fixBallots();
        karel.turnOff();  
    } 

    static {
        World.reset(); 
        World.readWorld("worlds/hangingchad.kwld"); 
        World.setBeeperColor(Color.black);
        World.setStreetColor(Color.gray);
        World.setNeutroniumColor(Color.black);
        World.setDelay(10);  
        World.setVisible(true);
    }
}
