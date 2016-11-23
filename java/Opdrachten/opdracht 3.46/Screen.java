
/**
 * Write a description of class Screen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Screen{

    private int xres;
    private int yres; 
    
    public Screen(int xRes, int yRes)
    {
        this.xres = xRes;
        this.yres = yRes;
        int pixels;
        pixels = numberOfPixels();

        if(pixels > 2000000){
            clear(false);   
        }
        
    }

    public int numberOfPixels()
    {
        return 5;
    }

    public void clear(boolean invert)
    {
        return;
    }

}

