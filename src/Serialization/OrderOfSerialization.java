package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//lecture 5
public class OrderOfSerialization {

    public static void main(String[] args) throws Exception{

        Dog d1 = new Dog();
        Cat c1 = new Cat();
        Rat r1 = new Rat();
        FileOutputStream fos = new FileOutputStream("abc.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);
        oos.writeObject(c1);
        oos.writeObject(r1);

        //Deserialization
        FileInputStream fis = new FileInputStream("abc.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Dog dog = (Dog) ois.readObject();
        Cat c = (Cat) ois.readObject();
        Rat r = (Rat) ois.readObject();
        System.out.println(dog.i +" " + c.i + " " + r.i);
        System.out.println(dog.j +" " + c.j + " " + r.j);



        // Now there is a scenario in which serialization is done by some other person deserialization i
//        done by some other than in that case at the time of dserialization we don't know the order
//        than we can do this
        /*
        Object o = ois.readObject();
        Dog dog = null;
        Cat c = null;
        Rat r = null;
        if(o instanceof Dog){
            dog = (Dog) o;
        }
        if (o instanceof Cat) {
            c = (Cat) o;
        }
        if (o instanceof Rat){
            r = (Rat) o;
        }
        System.out.println(dog.i +" " + c.i + " " + r.i);
        System.out.println(dog.j +" " + c.j + " " + r.j);
         */

    }
}
