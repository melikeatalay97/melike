package generics.bounding;
//extends Integer --> it brings child class of Integer
public class GenericUpperBounding <T extends Number> {  // when we put Integer or Double instead of number it gives CTE inside the main
    //setting boundary from Upper --> it is only we can use subClass of NUMBER

    private T[] numberArray; // field

    //Constructor
    public GenericUpperBounding(T[] numberArray) {
        this.numberArray = numberArray;
    }

    // Create a method find the average of an Array.
    public double getAverage() {
        double sum = 0;
        for (T t : numberArray) {
            sum += t.doubleValue(); // "doubleValue()" convert elements to double data type
        }
        double avg = sum/numberArray.length;
        return avg;
    }

    public static void main(String[] args) {

        Integer[] intArray = {2, 4, 5, 6, 7, 8, 9};
        GenericUpperBounding<Integer> obj1 = new GenericUpperBounding<>(intArray);
        System.out.println(obj1.getAverage());

        Double[] doubleArr = {4.5, 4.6, 5.6, 6.7};
        GenericUpperBounding<Double> obj2 = new GenericUpperBounding<>(doubleArr);
        System.out.println(obj2.getAverage());

        Float[] floatArr = {4.5F, 4.6F, 5.6F, 6.7F};
        GenericUpperBounding<Float> obj3 = new GenericUpperBounding<>(floatArr);
        System.out.println(obj2.getAverage());

//        String[] strArr = {"Ali", "Can", "Melike"};
//        GenericUpperBounding<String> obj4 = new GenericUpperBounding<>(strArr);  // ==> CTE because class extends to generic NUMBER
//        System.out.println(obj2.getAverage()); //it will save us from RTE and also TypeCasting.




    }

}
