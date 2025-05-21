package Interface_in_java;

interface PowerControl{
    void start();
    void stop();
}
interface Adjustable{
    void adjust(int level);
}
class Bulb implements Adjustable,PowerControl{
    public void start(){
        System.out.println("Bulb is on");
    }
    public void stop(){
        System.out.println("Bulb is off");
    }
    public void adjust(int level){
        System.out.println("Bulb can adjust at level : "+level);
    }
}
public class MultipleInterface {
    public static void  main(String[] args){
        Bulb b= new Bulb();
        b.start();
        b.stop();
        b.adjust(4);
    }
}
