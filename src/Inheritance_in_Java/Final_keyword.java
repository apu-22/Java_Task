package Inheritance_in_Java;

class  University{
    final void dis(){
        System.out.println("University trands");
    }
}
class Std extends University{
    void dis2(){
        super.dis();
        System.out.println("Students trands");
    }
}
public class Final_keyword {
    public static void main(String[] args){
        Std s1= new Std();
        s1.dis2();
    }
}
