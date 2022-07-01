package books;


import books.command.Commands;
import books.model.Author;
import books.model.Book;
import books.storage.AutherStorage;
import books.storage.BooksStorage;

import java.util.Scanner;

import static books.command.Commands.*;

public class BookDemo {
    public static Scanner scanner = new Scanner(System.in);
    private static BooksStorage booksStorage = new BooksStorage();
    private static AutherStorage autherStorage = new AutherStorage();


    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            Commands.printCommand();

            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    booksStorage.printAllBooks();
                    break;
                case PRINT_BOOKS_BY_AUTORNAME:
                    System.out.println("please input books authorName");
                    String authorName = scanner.nextLine();
                    booksStorage.printBooksByAuthorname(authorName);
                    break;
                case PRINT_BOOK_BY_GENRE:
                    System.out.println("please input books genre");
                    String genre = scanner.nextLine();
                    booksStorage.PrintBooksbyGenre(genre);
                case PRINT_BOOKS_BY_PRICE_RANGE:
                    System.out.println("please input minPrace");
                    int price = Integer.parseInt(scanner.nextLine());
                    System.out.println("please input maxPrice");
                    int price1 = Integer.parseInt(scanner.nextLine());
                    booksStorage.Printbooksbypricerange(price, price1);
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case PRINT_ALL_AUTHOR:
                    autherStorage.print();
                    break;
                default:
                    System.out.println("invalid command");

            }
        }
    }

    private static void addBook() {
        if (autherStorage.getSize() != 0) {
            autherStorage.print();
            System.out.println("please input index of auther");
            int authorIndex = Integer.parseInt(scanner.nextLine());
            Author author = autherStorage.getAuthorByIndex(authorIndex);
            if (author == null) {
                autherStorage.print();
            } else {
                System.out.println("plase input book,s title");
                String title = scanner.nextLine();
                System.out.println("please input books price");
                double price = Double.parseDouble(scanner.nextLine());
                System.out.println("please input book's count");
                int count = Integer.parseInt(scanner.nextLine());
                System.out.println("please input books genre  ");
                String genre = scanner.nextLine();
                Book book = new Book(title, author, price, count, genre);
                booksStorage.add(book);
                System.out.println("book was added");

            }
        }
    }

    private static void addAuthor() {
        System.out.println("Please input author name");
        String name = scanner.nextLine();
        System.out.println("Please input author surname");
        String authorSurname = scanner.nextLine();
        System.out.println("Please input author mail");
        String authorMail = scanner.nextLine();
        System.out.println("Please input author gender");
        String authorGender = scanner.nextLine();
        Author author = new Author(name, authorSurname, authorMail, authorGender);
        autherStorage.addAuthor(author);
        System.out.println("author grated");
    }

    private static void printBoobksByAuthorName() {
        System.out.println("Please input author name");
        String authorName = scanner.nextLine();
        if (authorName != null && !authorName.trim().equals(""))
            booksStorage.printBooksByAuthorname(authorName.trim());
    }

}
