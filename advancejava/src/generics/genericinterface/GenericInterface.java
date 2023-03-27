package generics.genericinterface;
// sms(school management system) --->  User Students -- Teacher -- employee  --> CRUD
public interface GenericInterface <T> {

    void setValue(T t);
    T getValue();

}
