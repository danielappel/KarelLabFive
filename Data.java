
import kareltherobot.*;

/**
 * Write a description of class Template here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Data extends Robot
{
    // instance variables - replace the example below with your own
    private int street;
    public int beepers;

    /**
     * Constructor for objects of class Template
     */
     public Data(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
        street = st;
        beepers = numBeepers;
    }

    public int getStreet()
    {
        // put your code here
        return this.street;
    }
}
