package generics.classes;

public class PrinterRunner {
    public static void main(String[] args) {

        PrintIntegerGenerics<Integer> print = new PrintIntegerGenerics<>();
        print.setThingToBePrinted(56);
        print.print();

        PrintIntegerGenerics<Double> doub = new PrintIntegerGenerics<>();
        doub.setThingToBePrinted(65.7);
        doub.print();

        PrintIntegerGenerics<String> str = new PrintIntegerGenerics<>();
        str.setThingToBePrinted("Hello Generics");
        //str.setThingToBePrinted(54); //compile time error --> better to handle
        str.print();



    }
}
