package generics.genericinterface;

// when we implement a class to a generic interface our class also has to be generic. we made this before we implemented it

//if we implement generic interface the implementing class also should implement be generic
public class GenericInterfaceImpl01<T> implements GenericInterface<T>{
    @Override
    public void setValue(T t) {

    }

    @Override
    public T getValue() {
        return null;
    }
}
