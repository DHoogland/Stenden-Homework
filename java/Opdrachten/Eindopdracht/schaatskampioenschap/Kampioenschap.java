
/**
 * Write a description of class Kampioenschap here.
 * 
 * @author dennis hartmann 
 * @version (a version number or a date)
 */
import java.util.*;
import java.util.Iterator;

public class Kampioenschap
{
    private ArrayList<Schaatser> schaatser;

    public Kampioenschap()
    {
        schaatser = new ArrayList<Schaatser>();

    }
    
    public void addSchaatser(Schaatser b)
    {        
       this.schaatser.add(b);       
    }
    
    public void aantalPunten()
    {
        int aantalPunten = schaatser.size();
        if(aantalPunten == -1)
        {
            System.out.println("fout");
        }
        else
        {
            int aantal = 0;
            Iterator<Schaatser> it = schaatser.iterator();
            
            while(it.hasNext())
            {
                Schaatser schaatser = it.next();
                aantal = schaatser.getPunten() + aantal;
            }
            System.out.println("aantal punten: "+ aantal +"");
    }
    
    
    }
    
   public void stand()
   {
       for(int i = 1; i < schaatser.size(); i++)
            {
                System.out.println(i + ": " + schaatser.get(i).getNaam()+ "  " + schaatser.get(i).getTijd500()+"  " + schaatser.get(i).getTijd1500()+ "  " + schaatser.get(i).getTijd5000()+ "  " + schaatser.get(i).getTijd10000() + "  " + schaatser.get(i).getPunten() );
            }
       
       
   }
    

    
    
    
     
    

}
