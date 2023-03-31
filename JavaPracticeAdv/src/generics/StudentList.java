package generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {
//        int[] random = { 6, -4, 12, 0, -10 };
//        int x = 12;
//        //Arrays.sort(random);
//        int y = Arrays.binarySearch(random, x);
//        System.out.println(y);


        List<Integer> list = Arrays.asList(10, 4, -1, 5);
        Collections.sort(list);
        System.out.println(Integer.valueOf(10));
        System.out.println();
        Integer array[] = list.toArray(new Integer[4]);
        System.out.println(array[0]);

        String [] names = {"Tom", "Dick", "Harry"};
        List<String> list1 = Arrays.asList(names);
        list1.set(0, "Sue");
        System.out.println(names[0]);

        List<String> hex = Arrays.asList("30", "8", "3A", "FF");
        Collections.sort(hex);

        System.out.println(hex);
        int x = Collections.binarySearch(hex, "8");
        int y = Collections.binarySearch(hex, "3A");
        int z = Collections.binarySearch(hex, "4F");
        System.out.println(x + " " + y + " " + z);

    }
}
