package enums.intro;

import java.sql.Array;
import java.util.Arrays;

public class DaysRunner {
    public static void main(String[] args) {

        // create an instance variable
        DaysOfWeek daysOfWeek = DaysOfWeek.MONDAY; // we can access them with class name
        System.out.println(daysOfWeek);
        System.out.println(daysOfWeek.ordinal());

        // print all enum constants on the console
        // values() method returns an array of enum constants containing all the enum constants
        //ordinal() method return the index of enum value
        for(DaysOfWeek days : DaysOfWeek.values()){
            System.out.println(days.ordinal()+" - "+ days);
        }

        // print all enum constants into array
        DaysOfWeek[] dayArr = DaysOfWeek.values();
        System.out.println(Arrays.toString(dayArr)); //[SUNDAY, SATURDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY]

        // print the specific element of enum constant with index
        System.out.println(daysOfWeek.values()[2]); //MONDAY
        System.out.println(daysOfWeek.values()); //[Lenums.intro.DaysOfWeek;@f6f4d33
        System.out.println(daysOfWeek.values().length); //7

        //valueOf() method returns the value of the enum constant
        System.out.println("The value of the enum : "+daysOfWeek.valueOf("MONDAY"));

        //switch
        switch (daysOfWeek){
            case SUNDAY :
                System.out.println("This is SUNDAY");
                break;
            case SATURDAY:
                System.out.println("This is SATURDAY");
                break;
            case MONDAY:
                System.out.println("This is MONDAY");
                break;
            case TUESDAY:
                System.out.println("This is TUESDAY");
                break;
            case WEDNESDAY:
                System.out.println("This is WEDNESDAY");
                break;
            case THURSDAY:
                System.out.println("This is THURSDAY");
                break;
            case FRIDAY:
                System.out.println("This is FRIDAY");
                break;
            default:
                System.out.println("Not valid Day Name");

        }






    }
}
