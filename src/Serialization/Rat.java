package Serialization;

import java.io.Serializable;

/*
Serializable is in java.io package, it doesn't consists any method(Marker Interface)
It means that the required ability would be provided by JVM
 */
public class Rat implements Serializable {

    int i = 40;
    transient int j = 20;
}
