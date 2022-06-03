package arrayUtil;

public class ArrayUtil {
    int charCount(char[] charsArray) {
        char c = 'a';
        int count = 0;
        for (int i = 0; i < charsArray.length; i++) {
            if (charsArray[i] == c) {
                count++;
            }
        }
        return count;
    }

    void javaLove(char[] chars2) {
        int a = chars2.length / 2;
        int b = a - 1;
        System.out.print(chars2[b] + " " + chars2[a]);


    }


    void javaLoly(char[] chars3) {
        if (chars3[chars3.length - 2] == 'l' && chars3[chars3.length - 1] == 'y') {
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }

    void bab(char[] bobArray) {
        char c = 'b';
        boolean b = false;
        for (int i = 0; i < bobArray.length - 2; i++) {
            if (bobArray[i] == 'b' && bobArray[i + 2] == 'b') {
                b = true;
            }

        }
        System.out.println(b);
    }

    void text(char[] text) {
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i]);
            }
        }
    }

    void  printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
   int max(int []nums){
        int max=nums[0];
       for (int i = 0; i <nums.length ; i++) {
           if (max<nums[i]){
               max=nums[i];
           }
       }
       return max;
   }
   int min(int []array){
        int min=array[0];
       for (int i = 0; i < array.length; i++) {
           if (min>array[i]){
               min=array[i];
           }

       }
       return min;
   }
void even(int[] nums){
        for (int i = 0; i < nums.length; i++) {
        if (nums[i]%2==0){
            System.out.print(nums[i]+" ");
        }

    }

}
void odd(int[]array){
        for (int i = 0; i < array.length; i++) {
        if (array[i]%2!=0) {
            System.out.print(array[i]+" ");
        }

    }

}
int evenCount(int []numbers){
        int count=0;
    for (int i = 0; i < numbers.length; i++) {
        if (numbers[i]%2==0){
            count++;
        }
    }
    return count;
}
int oddCount(int[]numbers){
        int count=0;
    for (int i = 0; i < numbers.length; i++) {
        if (numbers[i]%2!=0){
            count++;
        }

    }
    return count;
}
int sum(int []array){
        int sum=0;
    for (int i = 0; i < array.length; i++) {
        sum=sum+array[i];

    }
    return sum;
}
int avg(int []nums){
        int sum=0;
    for (int i = 0; i < nums.length; i++) {
       sum=sum+nums[i];
    } int avg=sum/nums.length;
    return avg;
}
}





