package serialization;

import java.io.*;

public class Serialization_DeSerialization {
    public static void main(String[] args) {

        //writeObjects();
        readObjects();

    }

    //method to write object into our local storage(writing Object is called Serialization
    public static void writeObjects(){
        System.out.println("User Objects are being created");
        User user1 = new User(1L, "Melike", "4566789");
        User user2 = new User(2L, "Cem", "5566789");
        User user3 = new User(3L, "Aykut", "6566789");
        User user4 = new User(4L, "Fatma", "7566789");
        User user5 = new User(5L, "Fatih", "8566789");

        try {
            FileOutputStream fos = new FileOutputStream("user.txt"); //it helps to create a file

            //to write object into file
            ObjectOutputStream output = new ObjectOutputStream(fos); //it helps to add Objects inside the file

            //for serialize the Object we call the writeObject()
            output.writeObject(user1);  //we assigned our object ici, and it converts it to byte stream
            output.writeObject(user2);
            output.writeObject(user3);
            output.writeObject(user4);
            output.writeObject(user5);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {  //input output exceptions
            throw new RuntimeException(e);
        }
    }

    //method to read Object  (read Objects is called deSerialization)
    public  static void readObjects(){
        try {
            FileInputStream fis = new FileInputStream("user.txt");
            ObjectInputStream input = new ObjectInputStream(fis);
            User user1 = (User) input.readObject();
            User user2 = (User) input.readObject();
            User user3 = (User) input.readObject();
            User user4 = (User) input.readObject();
            User user5 = (User) input.readObject();

            System.out.println(user1);
            System.out.println(user2);
            System.out.println(user3);
            System.out.println(user4);
            System.out.println(user5);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
