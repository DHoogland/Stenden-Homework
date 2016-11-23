
/**
 * Write a description of class Kampioenschap here.
 * 
 * @author dennis hartmann 
 */
import java.util.*;


public class Kampioenschap
{
    private ArrayList<Schaatser> schaatser;
    private Statistieken statistieken;
    
    public Kampioenschap()
    {
        schaatser = new ArrayList<Schaatser>();    
    }
    
    public void addSchaatser(Schaatser b)
    {        
       this.schaatser.add(b);       
    }
    
    public void stand()
    {
        statistieken = new Statistieken(schaatser);
        statistieken.stand();
    }
    
    public String getWinnaar()
    {
        statistieken = new Statistieken(schaatser);
        return statistieken.getNaamWinnaar();
    }
}
   
   

