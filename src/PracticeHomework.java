public class PracticeHomework {
    long convert(int minutes) {
        return minutes * 60;

    }

    int calcAge(int years) {
        return years * 365;
    }

    int nextNumber(int number) {
        return ++number;
    }
    boolean t=false;
    boolean isSameNum(int a, int b){
        if (a==b){
           t=true;
        }
        return t;
    }
    boolean b=false;
    boolean lessThanOrEqualToZero(int num){
        if (num<=0){
            b=true;
        }
        return b;
    }
    boolean reverseBool(boolean value){
        return !value;
    }
void maxLength(int[] array1, int[] array2){
        if (array1.length>array2.length){
            System.out.println(array1.length);
        }
        else {
            System.out.println(array2.length);
        }
    }
}
