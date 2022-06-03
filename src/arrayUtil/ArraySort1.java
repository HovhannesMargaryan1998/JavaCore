package arrayUtil;

public class ArraySort1 {
  void bubbleSort (int[] numbers){
        int tmp=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length-1; j++) {

                if (numbers[i]>numbers[j]){
                    tmp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=tmp;
                }

            }
            System.out.print(numbers[i]+" ");
        }
    }
    void charArray(char[] spaceArray){
        int startIndex=0;
        int endIndex=spaceArray.length-1;
        for (int i = 0; i < spaceArray.length; i++) {
            while (spaceArray[startIndex]==' '){
                startIndex++;
            }
            while (spaceArray[endIndex]==' '){
                endIndex--;
            }

        }
        int index=0;
        char[] result= new char[(endIndex-startIndex)+1];
        for (int i = startIndex; i <endIndex+1 ; i++) {
            result[index++]=spaceArray[i];


        }
        for (char c : result) {
            System.out.print(c);
        }
    }
}
