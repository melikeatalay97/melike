package generics.classes;

public class NonGenerics {

//    private Integer num;
//    private String str;
    private Object obj;

    public NonGenerics() {}

    public NonGenerics(Object obj) {
        this.obj = obj;
    }

    //getter - setter
    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }



}
