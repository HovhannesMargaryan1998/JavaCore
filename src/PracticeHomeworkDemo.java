public class PracticeHomeworkDemo {
    public static void main(String[] args) {
        PracticeHomework ph=new PracticeHomework();
        System.out.println(ph.convert(7));
        System.out.println(ph.calcAge(4));
        System.out.println(ph.nextNumber(9));
        System.out.println(ph.isSameNum(45,45));
        System.out.println(ph.lessThanOrEqualToZero(-80));
        System.out.println(ph.reverseBool(true));
        int []array1={12,54,78,69,36,12,456,78,12,36};
        int []array2={56,45,78,63,56,89,24,35,68,74,15,23,59};
        ph.maxLength(array1,array2);
    }
}
