package Inheritance_in_Java;

import java.awt.*;

class Animal{
    void eat(){
        System.out.println("This animal eat food");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("The dog is barking");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("The cat meow");
    }
}
public class Hierarchial_Inheritance {
    public static void main(String[] args){
        Dog d =new Dog();
        d.eat();
        d.bark();

        Cat c =new Cat();
        c.eat();
        c.meow();
    }
}
