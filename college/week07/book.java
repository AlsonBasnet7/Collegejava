class Books{
    public String title;
    public String author;
    public String ISBN;
    public int publicationYear;
    public String genre;
    public boolean availabilityStatus;

    public Books(String title, String author, String ISBN, int publicationYear, String genre, boolean availabilityStatus ){
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
        this.publicationYear=publicationYear;
        this.genre=genre;
        this.availabilityStatus=availabilityStatus;
    }
    public String toString(){

        return "The title of the books is"+this.title+
        "\n The author of the book is "+this.author+
        "\n The International Standard of Book Number is "+this.ISBN+
        "\n The publication year of the book is "+this.publicationYear+
        "\n The genre of the book is "+this.genre+
        "\n The availability of the books is "+this.availabilityStatus+
        

    }



}