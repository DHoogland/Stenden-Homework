/**
 * Read web server data and analyse
 * hourly access patterns.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2011.07.31
 */
public class LogAnalyzer
{
    // Where to calculate the hourly access counts.
    private int[] hourCounts;
    // Use a LogfileReader to access the data.
    private LogfileReader reader;

    /**
     * Create an object to analyze hourly web accesses.
     */
    public LogAnalyzer()
    { 
        // Create the array object to hold the hourly
        // access counts.
        hourCounts = new int[24];
        // Create the reader to obtain the data.
        reader = new LogfileReader();
    }

    /**
     * Analyze the hourly access data from the log file.
     */
    public void analyzeHourlyData()
    {
        while(reader.hasNext()) {
            LogEntry entry = reader.next();
            int hour = entry.getHour();
            hourCounts[hour]++;
        }
    }

    /**
     * Print the hourly counts.
     * These should have been set with a prior
     * call to analyzeHourlyData.
     */
    public void printHourlyCounts()
    {
        System.out.println("Hr: Count");
        for(int hour = 0; hour < hourCounts.length; hour++) {
            System.out.println(hour + ": " + hourCounts[hour]);
        }
    }
    
    public void printHourlyCountsTWO()
    {
        System.out.println("Hr: Count");
        int hour = 0;
        while(hour < hourCounts.length)
        {
            System.out.println(hour + ": " + hourCounts[hour]);
            hour++;
        }
    }
    
    public void printBusiestHour()
    {
        int highestNumber = -1;
        int highestHour=0;
        for(int i = 0; i < hourCounts.length; i++)
        {
            if(highestNumber < hourCounts[i])
            {
                highestNumber = hourCounts[i];
                highestHour = i;
            }
        }
        System.out.println("The busiest hour is: " + highestHour + " and the number of accesses at this hour is: " + highestNumber);
    }
    
    public void printQuietestHour()
    {
        int lowestNumber = 0;
        int lowestHour=0;
        for(int i = 0; i < hourCounts.length; i++)
        {
            if(lowestNumber > hourCounts[i] || i==0)
            {
                lowestNumber = hourCounts[i];
                lowestHour = i;
            }
        }
        System.out.println("The quietest hour is: " + lowestHour + " and the number of accesses at this hour is: " + lowestNumber);
    }
    
    public void twoHours()
    {
        int firstHour = 0;
        int secondHour = 1;
        int combined = 0;
        for(int i = 0; i < hourCounts.length; i++)
        {
            int firstValue = hourCounts[i];
            int secondValue = hourCounts[(i+1)];
            if(firstHour < 23 && secondHour <= 23)
            {
                System.out.println("First hour: " + firstHour + " (" + firstValue + "), second hour: " + secondHour + " (" + secondValue + ")");
                firstHour++;
                secondHour++;
            }
        }
    }
    
    /**
    * Return the number of accesses recorded in the log
    * file.
    */
    public int numberOfAccesses()
    {
        int total = 0;
        int counter = 0;
        // Add the value in each element of hourCounts
        // to total.
        while(counter < hourCounts.length)
        {
            total += hourCounts[counter];
            counter++;
        }
        return total;
    }
    
    /**
     * Print the lines of data read by the LogfileReader
     */
    public void printData()
    {
        reader.printData();
    }
}
