
class LibarayItems{
    String title;
    public LibarayItems(String title)
    {
        this.title = title;
    }

    public void displayInfo()
    {
        System.out.println("Tittle :"+ title);
    }
}
class Book extends LibarayItems{
    
    String author;
    public Book(String title,String author)
    {
        super(title);
        this.author = author;
    }

    public void displayBookInfo()
    {
        displayInfo();
        System.out.println("Author :"+ author);
    }
}
class Ebook extends Book{

    String fileFormat;
    public Ebook(String title,String author,String fileFormat)
    {
        super(title,author);
        this.fileFormat = fileFormat;
    }

    public void displayEbookInfo()
    {
        displayBookInfo();
        System.out.println("FileFormat :"+ fileFormat);
    }
}

public class LibraryManagement
{
    public static void main (String[] args)
    {
        Ebook e1 = new Ebook("Java Programming","John Doe","Pdf");
        e1.displayEbookInfo();
    }
}

