package generics.bounding;

import java.util.ArrayList;
import java.util.List;

//what is WildCard?  The Question Mark is represented the WildCard it stands for unknown type in generics
public class GenericLowerBoundingWildCard {

    public static void main(String[] args) {

        List<Object> objList = new ArrayList<>();
        addElements(objList);

        List<Number> numList = new ArrayList<>();
        addElements(numList);

        List<Integer> intList = new ArrayList<>();
        addElements(intList);

        List<Double> doubleList = new ArrayList<>();
        //addElements(doubleList);

        System.out.println("***** printElements *****");
        List<String> stringList = new ArrayList<>();
        stringList.add("java");
        stringList.add("generics");
        printElements(stringList);

        System.out.println("***** printObjects *****");
        List<Object> stringList2 = new ArrayList<>();
        stringList2.add("java");
        stringList2.add("generics");
        printObjects(stringList2);


    }

    //super Integer --> it brings parent class of Integer
    //extends Integer --> it brings child class of Integer
    //parent of Integer can be Object, Number, Integer
    public static void addElements(List<? super Integer> list) {  // it brings parent class of Integer

        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }

    //limitation of wildCard
    public static void printElements(List<?> listOfUnknown){
        //listOfUnknown.add("java"); //  CPT --> because of ? (unknown data type, add will not accept)
        listOfUnknown.add(null); //only null can be accepted
        for(Object w: listOfUnknown){
            System.out.println(w);
        }
    }

    public static void printObjects(List<Object> listOfUnknown){
        listOfUnknown.add("java");
        listOfUnknown.add(1);
        listOfUnknown.add(3.5);
        listOfUnknown.add(3.5F);
        for(Object w: listOfUnknown){
            System.out.println(w);
        }
    }
}


