
/**
 * Write a description of class Tijden here.
 * 
 * @author dennis hartmann 
 */
public class Schaatser
{
    private String naam;
    private int tijd500;
    private int tijd1500;
    private int tijd5000;
    private int tijd10000;
    private int punten;
    
    public Schaatser(String naam, int tijd500, int tijd1500, int tijd5000, int tijd10000)
    {
        this.naam = naam;
        this.tijd500 = tijd500;
        this.tijd1500 = tijd1500;
        this.tijd5000 = tijd5000;
        this.tijd10000 = tijd10000;
        
        punten += tijd500;
        punten += tijd1500/3;
        punten += tijd5000/10;
        punten += tijd10000/20;
    }
    
    public int getTijd500()
    {
        return tijd500;
    }
    
    public int getTijd1500()
    {
        return tijd1500;
    }
    
    public int getTijd5000()
    {
        return tijd5000;
    }
    
    public int getTijd10000()
    {
        return tijd10000;
    }
    
    public int getPunten()
    {
        return punten;
    }
    
    public String getNaam()
    {
        return naam;
    }

}
