package Inheritance_in_Java;

import java.awt.*;

class Person{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Student extends Person{
    private int registration;

    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        if(registration<0){
            System.out.println("invalid registration number");
        }else
            this.registration = registration;
    }

    void displayinfo(){
        System.out.println("Strudent name is: "+getName());
        System.out.println("Strudent age is: "+getAge());
        System.out.println("Strudent registration number  is: "+getRegistration());

    }
}
public class Inheri_With_Private_member {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setName("Apu");
        s1.setAge(23);
        s1.setRegistration(2022831022);

        s1.displayinfo();
    }
}
