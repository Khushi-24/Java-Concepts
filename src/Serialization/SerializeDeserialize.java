package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDeserialize {

    public static void main(String[] args) throws Exception{

        /*
        If we don't implement serializable Dog class our code will compile but we will get
        NonSerializable exception at run time
        */
        Dog d1 = new Dog();

        //Serialization
        //file extension doesn't matter it can be .txt .khushi anything
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);

        //Deserialization
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog dog = (Dog) ois.readObject();

        System.out.println( dog.i); //Output 10
        System.out.println(dog.j); //Output 0
        System.out.println(dog.password); //Output null
        System.out.println(dog.k); //Output 10 (static variable)
        System.out.println(dog.l); //Output 10 (transient static variable)
    }
}
