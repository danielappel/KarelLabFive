
import kareltherobot.*;


public class DataRunner implements Directions
{
    public static void main(String[] args){
           Data dan = new Data(1,1,East, 0);
           
           dan.getStreet();
           System.out.println("There are " + dan.beepers + " beepers.");
           
           //System.out.println("You are on " + dan.street + " street.");
           System.out.println("You are on " + dan.getStreet() + " street.");
           
           dan.turnOff();
    }
}
