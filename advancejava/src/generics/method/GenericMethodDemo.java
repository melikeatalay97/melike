package generics.method;

import java.util.Arrays;

public class GenericMethodDemo {
    public static void main(String[] args) {

        GenericMethodDemo obj = new GenericMethodDemo();  //Actually there is no to create obj because our methods are static

        System.out.println("***** print Array with none generic methods *****");

        Integer[] intArray = {3, 5, 6, 7, 8, 9, 12, 13};
        obj.print(intArray);

        System.out.println();

        Double[] doubleArray = {4.5, 6.5, 7.5, 8.5, 9.5};
        obj.print(doubleArray);   // without creating a method for this one it gives CTE, and it causes to duplication

        System.out.println();

        String[] strArray = {"Sara", "Melike", "Fatih", "Burak"};
        obj.print(strArray);

        System.out.println();

        System.out.println("***** print Array with generic method *****");
        obj.print(intArray);
        System.out.println();
        obj.print(doubleArray);
        System.out.println();
        obj.print(strArray);
        System.out.println();

        Float[] floatArray = {1F, 2F, 3F, 13F, 34F};
        obj.print(floatArray);



    }
    public static void print(Integer[] arr){
        Arrays.stream(arr).forEach(t-> System.out.print(t+" "));
    }

    public static void print(Double[] arr){
        Arrays.stream(arr).forEach(t-> System.out.print(t+" "));
    }

    public static void print(String[] arr){
        Arrays.stream(arr).forEach(t-> System.out.print(t+" "));
    }

    //Create Generic method for printing Array.
    public <T> void print(T[] arrG){
        for (T w: arrG){
            System.out.print(w+" ");
        }

    }


}
