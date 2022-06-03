public class Example {
    public static void main(String[] args) {
        int number = 521;
        int reverse = 0;
        while (number != 0) {
            int r = number % 10;
            reverse = reverse * 10 + r;
            number = number / 10;
        }
        System.out.print(reverse);
        System.out.println();
        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        int y;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length - i; j++) {
                if (numbers[j] < numbers[j - 1]) {
                    y = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = y;

                }

            }

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int startindex =0;
        int endindex=spaceArray.length-1;
        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[startindex]==' '){
                startindex++;

            }else {
                break;
            }

        }
        for (int i = endindex; i >0 ; i--) {
            if (spaceArray[endindex]==' '){
                endindex--;
            }else {
                break;
            }
        }
        char[]resalt=new char[endindex-startindex+1];
        int a=0;
        for (int i = startindex; i <endindex+1 ; i++) {
           resalt[a++]=spaceArray[i];
        }
        for (int i = 0; i < resalt.length; i++) {
            System.out.print(resalt[i]);
        }
    }
}