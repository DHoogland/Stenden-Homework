
/**
 * Write a description of class RekenMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RekenMachine
{
    // alle velden altijd private
    private int getalA;
    private int getalB;
    private int uitkomst;

    /**
     * Constructor for objects of class RekenMachine / zelfde naam als de class altijd
     */
    public RekenMachine()
    {
        // initialise instance variables
        getalA = 10;
        getalB = 23;
        uitkomst = 0;
    }

    /**
     * methods - 
    
     */
    public void opTellenNieuw() //void doet iets wat niet naar scherm hoeft. 
                                //void is nooit return waarde
    {
        uitkomst = getalA + getalB;
        
    }
    
    public int opTellen()  //int wil return
    {
        int uitkomst;
        uitkomst = getalA + getalB;
        return uitkomst;
    }
}
