package books.storage;

import books.model.Author;

public class AutherStorage {
    Author[] array = new Author[10];
    private int size = 0;

    public void addAuthor(Author author) {
        if (size == array.length - 1) {
            extend();
        }
        array[size++] = author;
    }

    private void extend() {
       Author[] array2 = new Author[(array.length * 3) / 2 + 1];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        array = array2;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(i + ". " + array[i] + " ");
        }
        System.out.println();
    }


    public void deleteByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("invalid index");
        } else {
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }

    public int getSize() {
        return size;
    }


    public Author getAuthorByIndex(int index) {
        if (index < 0 || index > size) {
            return null;
        }
        return array[index];
    }

}