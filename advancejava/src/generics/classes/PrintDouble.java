package generics.classes;

public class PrintDouble {

    private Double thingsToBePrinted;

    public Double getThingsToBePrinted() {
        return thingsToBePrinted;
    }

    public void setThingsToBePrinted(Double thingsToBePrinted) {
        this.thingsToBePrinted = thingsToBePrinted;
    }

    public void print(){
        System.out.println(thingsToBePrinted);
    }
}
