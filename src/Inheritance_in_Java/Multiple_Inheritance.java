package Inheritance_in_Java;

import java.awt.*;

interface Fyable{
    void fly();
}
interface Swimmable{
    void swim();
}
class Duck implements Fyable,Swimmable{
    public void fly(){
        System.out.println("Duck can fly");
    }
    public void swim(){
        System.out.println("duck can swim");
    }
}
public class Multiple_Inheritance {
    public static void main(String[]args){
        Duck d =new Duck();
        d.fly();
        d.swim();
    }
}
