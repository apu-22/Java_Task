package Inheritance_in_Java;

class Animall{
    void breathe(){
        System.out.println("Animal breathe");
    }
}
class Hen extends Animall{
    @Override
    void breathe(){
        System.out.println("hen is also");
    }
}
public class Iintro_Overridden {
    public static void main(String[] args){
        Hen h1=new Hen();
        h1.breathe();
    }
}
