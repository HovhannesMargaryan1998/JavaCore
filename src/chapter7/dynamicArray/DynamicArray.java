package chapter7.dynamicArray;

public class DynamicArray {
    int[] array = new int[10];
    int size = 0;

    void add(int value) {
        if (size == array.length - 1) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        int[] array2 = new int[(array.length * 3) / 2 + 1];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        array = array2;
    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    boolean isEmpty() {
        return size == 0;
    }
    int getByIndex(int index) {
        return array[index];
    }

    int getFirstIndexByValue(int value) {
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                a = i;
            }
        }
        return a;
    }
    void set(int index, int value) {
        array[index] = value;

    }

    void add(int index, int value) {
        if (index < 0 || index > size) {
            System.out.println("invalid index");
        }
        if (size == array.length) {
            extend();
        }
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = value;
        size++;
    }
    void delete(int index) {
        if (index < 0 || index > size) {
            System.out.println("invalid index");
        }
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }
}