package books.command;

public interface Commands {
    int EXIT = 0;
    int ADD_BOOK = 1;
    int PRINT_ALL_BOOKS = 2;
    int PRINT_BOOKS_BY_AUTORNAME = 3;
    int PRINT_BOOK_BY_GENRE = 4;
    int PRINT_BOOKS_BY_PRICE_RANGE = 5;
    int ADD_AUTHOR = 6;
    int PRINT_ALL_AUTHOR = 7;

    static void printCommand() {
        System.out.println("please input " + EXIT + " for Exit");
        System.out.println("please input " + ADD_BOOK + " for Add Book");
        System.out.println("please input " + PRINT_ALL_BOOKS + " for Print All Books ");
        System.out.println("please input " + PRINT_BOOKS_BY_AUTORNAME + " for Print Books by AuthorName ");
        System.out.println("please input " + PRINT_BOOK_BY_GENRE + " for Print Books by Genre");
        System.out.println("please input " + PRINT_BOOKS_BY_PRICE_RANGE + " for Print books by price range");
        System.out.println("please input " + ADD_AUTHOR + " for add author");
        System.out.println("please input " + PRINT_ALL_AUTHOR + " for print all author");
    }
}
