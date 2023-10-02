package Serialization;

import java.io.Serializable;

/*
Serializable is in java.io package, it doesn't consists any method(Marker Interface)
It means that the required ability would be provided by JVM
 */
public class Dog implements Serializable {

    int i = 10;
    int j = 20;
}
