package books;

import books.command.Commands;
import books.exception.AuthorNotFoundException;
import books.model.Author;
import books.model.Book;
import books.storage.AutherStorage;
import books.storage.BooksStorage;

import java.util.Scanner;

public class BookDemo implements Commands {
    public static Scanner scanner = new Scanner(System.in);
    private static BooksStorage booksStorage = new BooksStorage();
    private static AutherStorage autherStorage = new AutherStorage();


    public static void main(String[] args) {
        boolean run;
        System.out.println("Please input login");
        if (scanner.nextLine().equals("java")) {
            System.out.println("Please input password");
            if (scanner.nextLine().equals("love")) {
                run = true;
                while (run) {
                    Commands.printCommand();
                    int command;
                    try {
                        command = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        command = -1;

                    }

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
                            printBooksByAuthorName();
                            break;
                        case PRINT_BOOK_BY_GENRE:
                            printBooksByGenre();
                            break;
                        case PRINT_BOOKS_BY_PRICE_RANGE:
                            printBooksByPriceRange();
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
        }
    }

    private static void printBooksByGenre() {
        System.out.println("please input books genre");
        String genre = scanner.nextLine();
        booksStorage.PrintBooksbyGenre(genre);
    }

    private static void printBooksByPriceRange() {
        try {
            System.out.println("please input minPrice");
            int price = Integer.parseInt(scanner.nextLine());
            System.out.println("please input maxPrice");
            int price1 = Integer.parseInt(scanner.nextLine());
            booksStorage.Printbooksbypricerange(price, price1);
        } catch (NumberFormatException e) {
            System.out.println("Plese input only numbers");
        }

    }

    private static void printBooksByAuthorName() {
        System.out.println("please input books authorName");
        String authorName = scanner.nextLine();
        booksStorage.printBooksByAuthorname(authorName);
    }

    private static void addBook() {
        if (autherStorage.getSize() != 0) {
            autherStorage.print();
            System.out.println("please input index of author");

            Author author = null;
            Book book = null;
            try {
                int authorIndex = Integer.parseInt(scanner.nextLine());
                author = autherStorage.getAuthorByIndex(authorIndex);
                System.out.println("please input book,s title");
                String title = scanner.nextLine();
                while (title.equals("")) {
                    System.out.println("plase input book,s title");
                    title = scanner.nextLine();
                }
                System.out.println("please input books price");
                double price = Double.parseDouble(scanner.nextLine());
                System.out.println("please input book's count");
                int count = Integer.parseInt(scanner.nextLine());
                System.out.println("please input books genre  ");
                String genre = scanner.nextLine();
                book = new Book(title, author, price, count, genre);
                booksStorage.add(book);
                System.out.println("book was added");

            } catch (AuthorNotFoundException | NumberFormatException e) {
                System.out.println("please choose correct number or index");
                autherStorage.print();
                booksStorage.add(book);
            }

        }
    }

    private static void addAuthor() {
        String authorMail = null;
        System.out.println("Please input author name");
        String name = scanner.nextLine();
        while (name.equals("")) {
            System.out.println("Please input author name");
            name = scanner.nextLine();
        }
        System.out.println("Please input author surname");
        String authorSurname = scanner.nextLine();
        while (authorSurname.equals("")) {
            System.out.println("Please input author surname");
            authorSurname = scanner.nextLine();
        }
        try {

            System.out.println("Please input author mail");

            authorMail = scanner.nextLine();

            if (!authorMail.contains("@")) {
                throw new IllegalArgumentException();
            }


        } catch (IllegalArgumentException e) {
            System.out.println("the mail should contain @ ");
            addAuthor();
        }

        System.out.println("Please input author gender");
        System.out.println("Please choose 1 for male, Please choose 2 for female");
        int index;

        try {
            index = Integer.parseInt(scanner.nextLine());


            if (index == 1) {
                String authorGender = "male";
                Author author = new Author(name, authorSurname, authorMail, authorGender);
                autherStorage.addAuthor(author);
                System.out.println("author crated");
            } else if (index == 2) {
                String authorGender = "female";
                Author author = new Author(name, authorSurname, authorMail, authorGender);
                autherStorage.addAuthor(author);
                System.out.println("author created");

            }

        } catch (NumberFormatException e) {
            System.out.println(e);
        }


    }

    private static void printBoobksByAuthorName() {
        System.out.println("Please input author name");
        String authorName = scanner.nextLine();
        if (authorName != null && !authorName.trim().equals(""))
            booksStorage.printBooksByAuthorname(authorName.trim());
    }


}
