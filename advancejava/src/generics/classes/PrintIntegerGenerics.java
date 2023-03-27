package generics.classes;

/*
     T --> Type
     E --> Element
     K --> Key
     V --> Value
     N --> Number

     S, U, ...
 */

public class PrintIntegerGenerics<T>{

    private T thingToBePrinted;  //Data type was Integer

    //getter and setter
    public T getThingToBePrinted() {   //Data type was Integer
        return thingToBePrinted;
    }

    public void setThingToBePrinted(T thingToBePrinted) {   //Data type was Integer
        this.thingToBePrinted = thingToBePrinted;
    }

    public void print(){
        System.out.println(thingToBePrinted);
    }
}
