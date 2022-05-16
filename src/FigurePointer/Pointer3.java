package FigurePointer;

public class Pointer3 {
    public static void main(String[] args) {
        int i, j;
        for (i = 0; i < 5; i++) {
            for (j = 0; j <i; j++) {
                System.out.print("  ");
            }
            for (j = 5; j >i; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
