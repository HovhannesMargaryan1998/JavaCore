package book.model;

public class Book {
    private String title;
    private Author author;
    private double price;
    private int count;
    private String genre;



    public Book(String title, Book author, double price, int count, String genre) {
        this.title = title;
        this.author = getAuthorName();
        this.price = price;
        this.count = count;
        this.genre = genre;
    }

    public Book(String title, Author author, double price, int count, String genre) {

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthorName() {
        return author;
    }

    public void setAuthor(Author authorName) {
        this.author = authorName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authorName='" + author + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", genre='" + genre + '\'' +
                '}';
    }
}
