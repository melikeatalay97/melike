package generics.classes;

//if we use more than ona Data in generics

public class GenericTypeWithTwoParameter <U,S>{

    private U u;
    private S s;

    //constructor
    public GenericTypeWithTwoParameter(U u, S s) {
        this.u = u;
        this.s = s;
    }

    //getter and setter

    public U getU() {
        return u;
    }

    public void setU(U u) {
        this.u = u;
    }

    public S getS() {
        return s;
    }

    public void setS(S s) {
        this.s = s;
    }

    public static void main(String[] args) {
        GenericTypeWithTwoParameter<String,String> obj1 = new GenericTypeWithTwoParameter<>("Ali", "Can");
        GenericTypeWithTwoParameter<String,Integer> obj2 = new GenericTypeWithTwoParameter<>("Ali", 1);
        GenericTypeWithTwoParameter<Integer,String> obj3 = new GenericTypeWithTwoParameter<>(2, "Can");

        System.out.println(obj1.getS());
        System.out.println(obj2.getS());
        System.out.println(obj3.getS());

        System.out.println(obj1.getU());
        System.out.println(obj2.getU());
        System.out.println(obj3.getU());

    }
}
