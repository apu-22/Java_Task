package Encapsulation;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

class person{
    private String name;
    private  int age;

//    public String getName() {
//        return name;
//    }
//    public void setName(String newName){
//        this.name=newName;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo(){
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
    }
}
public class IntroEncap {
    public static void main(String[] args){
        person p1 = new person();
        p1.setName("Apu");
        p1.setAge(23);
        p1.displayInfo();

        person p2 = new person();
        p2.setName("lb");
        p2.setAge(22);
        p2.displayInfo();

        person p3 = new person();
        p3.setName("lbapu");
        p3.setAge(10);

        System.out.println("Person no 3 : "+p3.getName());
        System.out.println("Person no 3 : "+p3.getAge());

        p2.setAge(20);  //update the age of person number 2
        p2.displayInfo();


    }
}
