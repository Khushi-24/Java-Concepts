package Serialization;

import java.io.Serializable;

/*
Serializable is in java.io package, it doesn't consists any method(Marker Interface)
It means that the required ability would be provided by JVM
 */
public class Dog implements Serializable {

    int i = 10;
    transient int j = 20;

    transient String password = "hello";

    static int k = 10;
    transient static int l = 10;
}
