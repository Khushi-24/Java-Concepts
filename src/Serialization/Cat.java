package Serialization;

import java.io.Serializable;

/*
Serializable is in java.io package, it doesn't consists any method(Marker Interface)
It means that the required ability would be provided by JVM
 */
public class Cat implements Serializable {

    int i = 30;
    transient int j = 20;
}
