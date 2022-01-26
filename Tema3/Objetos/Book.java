package Objetos;
/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, String refNUmber, boolean bookCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNUmber= "";
        courseText = bookCourseText;
    }

    public String getAuthor(){return this.author;}
    public String getTitle(){return this.title;}
    public int getPages(){return this.pages;}
    public void borrowBook(){borrowed++;}
    public int getBorrowed(){return this.borrowed;}
    public boolean isCourseText(){return this.courseText;}

    public void printAuthor (){System.out.println(this.author);}
    public void printTitle (){System.out.println(this.title);}

    public void setRefNumber(String refNumber){
        if(refNumber.length() > 3 ) 
            this.refNumber = refNumber;
        else
            System.out.println("Has introducido menos de 3 digitos");
    }

    public String getRefNumber(){return this.refNumber;}

    public void printDetails() {
        System.out.println("El autor es "+this.author);
        System.out.println("El titulo es "+this.title);
        System.out.println("El libro tiene "+this.pages+" paginas");
        System.out.println("La referencia del libro es "+this.refNumber);
        System.out.println("El libro se ha prestado "+this.borrowed);
        if (courseText)
            System.out.println("El libro esta en un curso");
        else
            System.out.println("El libro no esta en ningun curso");
        
    }

    // Add the methods here ...
}
