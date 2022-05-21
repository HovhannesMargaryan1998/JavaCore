package arrayUtil;

public class ArrayExample {
    public static void main(String[] args) {

        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        System.out.println(max);

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        System.out.println(min);

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                System.out.print(array[i] + " ");
        }

        System.out.println();

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println(count);

        int count1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count1++;
            }
        }

        System.out.println(count1);

        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average = average + array[i];
        }
        average = average / array.length;
        System.out.println(average);

        int x=0;
        for (int i = 0; i < array.length ; i++) {
            x=x+array[i];
        }
        System.out.println(x);
    }
}
