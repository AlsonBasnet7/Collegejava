class Book {
    public String title;
    public String author;
    public String isbn;
    public int publicationYear;
    public String genre;
    public boolean availabilityStatus;

    Book(String title, String author, String isbn, int publicationYear, String genre, boolean availabilityStatus) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
        this.genre = genre;
        this.availabilityStatus = availabilityStatus;
    }
}
public class library {
    public static void main(String[] args) {

        Book b1 = new Book("The Alchemist", "Paulo Coelho", "ISBN001", 1998, "Fiction", true);
        Book b2 = new Book("Clean Code", "Robert C. Martin", "ISBN002", 2008, "Programming", false);
        Book b3 = new Book("Harry Potter", "J.K. Rowling", "ISBN003", 2001, "Fantasy", true);

        // Display all books
        System.out.println("All Books:");
        System.out.println(b1.title + ", " + b1.author + ", " + b1.isbn + ", " + b1.publicationYear + ", " + b1.genre + ", Available: " + b1.availabilityStatus);
        System.out.println(b2.title + ", " + b2.author + ", " + b2.isbn + ", " + b2.publicationYear + ", " + b2.genre + ", Available: " + b2.availabilityStatus);
        System.out.println(b3.title + ", " + b3.author + ", " + b3.isbn + ", " + b3.publicationYear + ", " + b3.genre + ", Available: " + b3.availabilityStatus);

        // Available books
        System.out.println("\nAvailable Books:");
        if (b1.availabilityStatus==true)
            System.out.println(b1.title);
        if (b2.availabilityStatus==true)
            System.out.println(b2.title);
        if (b3.availabilityStatus==true)
            System.out.println(b3.title);

        // Not available books
        System.out.println("\nNot Available Books:");
        if (b1.availabilityStatus==false)
            System.out.println(b1.title);
        if (b2.availabilityStatus==false)
            System.out.println(b2.title);
        if (b3.availabilityStatus==false)
            System.out.println(b3.title);

        // Available books published after 2000
        System.out.println("\nAvailable Books Published After 2000:");
        if (b1.availabilityStatus==true && b1.publicationYear > 2000)
            System.out.println(b1.title);
        if (b2.availabilityStatus==true && b2.publicationYear > 2000)
            System.out.println(b2.title);
        if (b3.availabilityStatus==true && b3.publicationYear > 2000)
            System.out.println(b3.title);
    }
}