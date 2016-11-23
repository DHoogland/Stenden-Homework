
  //A class that maintains information on a book.
  //This might form part of a larger application such
  //as a library system, for instance.
 
  //@author (Insert your name here.)
  //@version (Insert today's date here.)
 
class Book
{
     //The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;

    
      //Set the author and title fields when this object
     // is constructed.
     
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
    }
    
    public void setRefNumber(String ref)
    {
        
        int newRefLength;
        newRefLength = ref.length();
        
        if(newRefLength <= 2)
            System.out.println("Refnumber is te kort");
        else
            refNumber = ref;       
    }
    
    public String getAuthor()
    {
        return author;
    }

    public void borrow()
    {
        borrowed += 1;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getPages()
    {
        return pages;
    }
    
    public String getRefNumber()
    {
        return refNumber;
    }
    
    public void printDetails()
    {
        System.out.println("Titel" + title );
        System.out.println("Auteur" + author );
        System.out.println("Pagina's" + pages );
        
        int refLength;
        refLength = refNumber.length();
        if(refLength == 0)
            System.out.println("RefNumber ZZZ");
        else
            System.out.println("RefNumber" + refNumber );
            
        System.out.println("Gehuurd" + borrowed );     
            
        System.out.println( );
    }
    
}