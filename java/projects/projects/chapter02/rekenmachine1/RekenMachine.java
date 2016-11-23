
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
    public RekenMachine(int getalA, int getalB) //alles wat hier staat moet this. naam = naam worden
                                                // rest = 0; of standaard getal.
    {
        // this bedoelt alles uit hierboven/ this - this uit deze class
        this.getalA = getalA;
        this.getalB = getalB;
        uitkomst = 0;
        
    }
    
    public int telOp()
    {
        return getalA + getalB;
    }
}