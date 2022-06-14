package chapter7.dynamicArray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        int[] array = new int[10];

        DynamicArray dynArray = new DynamicArray();
        dynArray.add(5);
        dynArray.add(3);
        dynArray.add(7);
        dynArray.add(8);
        dynArray.add(9);
        dynArray.add(6);
        dynArray.add(1);
        dynArray.add(2);
        dynArray.add(7);
        dynArray.add(9);

        System.out.println(array.length);
        System.out.println(dynArray.isEmpty());
        System.out.println(dynArray.getByIndex(3));
        System.out.println(dynArray.getFirstIndexByValue(7));
        dynArray.set(1, 4);
        dynArray.delete(2);

        dynArray.print();
    }
}
