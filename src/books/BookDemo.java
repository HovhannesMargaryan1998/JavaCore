package books;


import java.util.Scanner;

public class BookDemo {
    public static Scanner scanner = new Scanner(System.in);
    private static BooksStorage booksStorage = new BooksStorage();

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("please input 0 for Exit");
            System.out.println("plesae input 1 for Add Book");
            System.out.println("please input 2 for Print All Books ");
            System.out.println("please input 3 for Print Books by AuthorName ");
            System.out.println("please input 4 for Print Books by Genre");
            System.out.println("please input 5 for Print books by price range");
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case 0:
                    run = false;
                    break;
                case 1:
                    addBook();
                    break;
                case 2:
                    booksStorage.printAllBooks();
                    break;
                case 3:
                    System.out.println("please input books authorName");
                    String authorName = scanner.nextLine();
                    booksStorage.printBooksByAuthorname(authorName);
                    break;
                case 4:
                    System.out.println("please input books genre");
                    String genre = scanner.nextLine();
                    booksStorage.PrintBooksbyGenre(genre);
                case 5:
                    System.out.println("please input minPrace");
                    int price = Integer.parseInt(scanner.nextLine());
                    System.out.println("please input maxPrice");
                    int price1=Integer.parseInt(scanner.nextLine());
                    booksStorage.Printbooksbypricerange(price, price1);
                    break;
                default:
                    System.out.println("invalid command");

                    Book book = new Book();
                    booksStorage.add(book);
                    System.out.println("Thank you,student was added");
            }
        }
    }

    private static void addBook() {
        System.out.println("plase input book,s title");
        String title = scanner.nextLine();
        System.out.println("please input authorName ");
        String authorName = scanner.nextLine();
        System.out.println("please input books price");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("please input book's count");
        int count=Integer.parseInt(scanner.nextLine());
        System.out.println("please input books genre  ");
        String phoneNumber = scanner.nextLine();
        Book book=new Book(title,authorName,price,count, phoneNumber);
        booksStorage.add(book);
        System.out.println("book was added");
    }
}
