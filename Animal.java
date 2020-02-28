//Gia Bugieda - added Animal file with Animal class
//The addition of this file helps make MyCompare3.java compile and run

import java.util.*;

public class Animal{
    String name;
    int legs;

    Animal(String animName, int numLegs){
	this.name = animName;
	this.legs = numLegs;
    }

    public int getLegs(){
	return this.legs;
    }

    public String toString(){
	return name + " " + legs;
    }
    

}
