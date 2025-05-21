package Inheritance_in_Java;

import java.awt.*;

class Animals{
    String name;
    void breathe(){
        System.out.println(name+ " is breathing");
    }
}
class Mammal extends Animals{
    void feedMilk(){
        System.out.println(name+ " is feeding milk");
    }
}
class Dogs extends Mammal{

    void bark(){
        System.out.println(name+ " is barking");
    }
}
public class Multilevel_Inheritance {
    public static void main(String[] args){
        Dogs d =new Dogs();
        d.name="Puppy";

        d.bark();
        d.breathe();
        d.feedMilk();
    }
}
