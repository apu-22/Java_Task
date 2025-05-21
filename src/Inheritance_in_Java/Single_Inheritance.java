package Inheritance_in_Java;

class Vehical {
    String color;
    int maxspeed;

    void dis1(){
        System.out.println("Color name: "+color);
        System.out.println("Max speed: "+maxspeed);
    }
}

class Car extends Vehical{
    String model;
    void dis2(){
        System.out.println("Model name: "+model);
        System.out.println("Color name: "+color);
        System.out.println("Max speed: "+maxspeed);
    }
}

public class Single_Inheritance {
    public static void main(String[] args){
        Car c1 = new Car();
        c1.color="red";
        c1.model="Toyota";
        c1.maxspeed=120;

        c1.dis1();
        c1.dis2();
    }
}
