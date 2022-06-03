package arrayUtil;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        ArrayUtil au = new ArrayUtil();
        char[] charsArray = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        au.javaLove(charsArray);
        System.out.println();
        System.out.println(au.charCount(charsArray));
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y' };
        au.javaLoly(chars);
        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a' };
        au.bab(bobArray);
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' ' };
        au.text(text);
        System.out.println();
        int[] numbers = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30, 15};
        au.printArray(numbers);
        System.out.println();
        System.out.println(au.max(numbers));
        System.out.println(au.min(numbers));
        au.odd(numbers);
        System.out.println();
        au.even(numbers);
        System.out.println();
        System.out.println(au.evenCount(numbers));
        System.out.println(au.oddCount(numbers));
        System.out.println(au.sum(numbers));
        System.out.println(au.avg(numbers));
        ArraySort1 as=new ArraySort1();
        int[] numbers1 = {43, 55, 5, -9, 0, 12, 5, 65};
        as.bubbleSort(numbers1);
        System.out.println();
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        as.charArray(spaceArray);
    }
}
