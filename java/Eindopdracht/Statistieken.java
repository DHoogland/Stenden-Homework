import java.util.*;

/**
 * Write a description of class Statistieken here.
 * 
 * @author dennis hartmann 
 */
public class Statistieken
{
    private ArrayList<Schaatser> schaatsers;
    
    public Statistieken(ArrayList<Schaatser> schaatsers)
    {
        this.schaatsers = schaatsers;
    }
    
    public void stand()
    {
       int stand = schaatsers.size();
       for(int i = 0; i < schaatsers.size(); i++)
       {
            System.out.println(i+1 + ": naam : " + schaatsers.get(i).getNaam()+ " Tijd 500: " + schaatsers.get(i).getTijd500()+" Tijd 1500: " + schaatsers.get(i).getTijd1500()+ " Tijd 5000: " + schaatsers.get(i).getTijd5000()+ " Tijd 10000: " + schaatsers.get(i).getTijd10000() + " Totale punten:" + schaatsers.get(i).getPunten() );
       }       
    }
    
    public String getNaamWinnaar()
    {
        String naamWinnaar = "";
        int puntenWinnaar = 0;
        int count = 0;
        for (Schaatser schaatser : schaatsers)
        {
            if(schaatser.getPunten() < puntenWinnaar || count < 1)
            {
                puntenWinnaar = schaatser.getPunten();
                naamWinnaar = schaatser.getNaam();
            }
            count++;
        }
        return naamWinnaar;
    }
}
