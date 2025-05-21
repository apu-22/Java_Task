package Inheritance_in_Java;

class Vehicle{
    String color;
    double weight;
     Vehicle(String c, double w){
         this.color=c;
         this.weight=w;
     }

     void disInfo(){
         System.out.println("Color : "+color);
         System.out.println("Weight ; "+weight);
     }
}
class Cr extends Vehicle{
    String brand;
    Cr(String c, double w,String b){
        super(c,w);
        this.brand=b;
    }

    @Override
    void disInfo(){
        super.disInfo();
        System.out.println("Brand ; "+brand);
    }

}
public class Super_keyword {
    public static void main(String[] args){
        Cr c=new Cr("Red",450.50,"BMW");
        c.disInfo();

        Vehicle v=new Vehicle("Black",1000.5);
        v.disInfo();
    }
}
