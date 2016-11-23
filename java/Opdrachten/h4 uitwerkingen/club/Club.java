import java.util.ArrayList;
/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // Define any necessary fields here ...
    private ArrayList<Membership> members;
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        members = new ArrayList<Membership>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size();
    }
    
    /**
    * Determine the number of members who joined in the
    * given month.
    * @param month The month we are interested in.
    * @return The number of members who joined in that month.
    */
    public int joinedInMonth(int month)
    {
        int membersJoined = members.size();
        int counter = 0;
        if(month < 1 || month > 12)
        {
            System.out.println("Invalid month!");
        }
        else
        {
            for(Membership membership : members)
            {
                if(membership.getMonth() == month)
                {
                    counter++;
                }
            }
        }
        return counter;
    }
    
    /**
    * Remove from the club's collection all members who
    * joined in the given month, and return them stored
    * in a separate collection object.
    * @param month The month of the membership.
    * @param year The year of the membership.
    * @return The members who joined in the given month and year.
    */
    public ArrayList<Membership> purge(int month, int year)
    {
        ArrayList<Membership> collection = new ArrayList<Membership>();
        if(month < 1 || month > 12)
        {
            System.out.println("Invalid month!");
            return collection;
        }
        else
        {
            for(Membership membership : members)
            {
                if(membership.getMonth() == month && membership.getYear() == year)
                {
                    System.out.println(membership.getName());
                    //String name = membership.getName();
                    //collection.add(name);
                }
            }
            return collection;
        }
    }
}
