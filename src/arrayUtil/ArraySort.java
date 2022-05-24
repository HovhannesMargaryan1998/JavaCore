package arrayUtil;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        int tmp = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }


            }
            System.out.print(numbers[i] + " ");


        }
        System.out.println();
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int first = 0;
        int second = spaceArray.length - 1;
        for (int i = first; i < second; i++) {
            if (spaceArray[first] == ' ') {
                first++;
            }


        }
        for (int i = first; i < second; i++) {
            if (spaceArray[second] == ' ') {
                second--;
            }

        }
        char[] result = new char[(second - first) + 1];
        int index = 0;
        for (int i = first; i < second + 1; i++) {
            result[index++] = spaceArray[i];

        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }
}
