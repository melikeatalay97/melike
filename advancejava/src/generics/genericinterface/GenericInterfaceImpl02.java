package generics.genericinterface;


//when we are sure that we will use a specific dt in a class which is implemented to a generic interface we should type the dt instead of T..
public class GenericInterfaceImpl02 implements GenericInterface<String>{
    @Override
    public void setValue(String s) {

    }

    @Override
    public String getValue() {
        return null;
    }
}
