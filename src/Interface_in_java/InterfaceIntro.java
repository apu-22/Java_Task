package Interface_in_java;

interface polygon{
    void getArea(int l,int b);
}
class Rectangle implements polygon{
    public void getArea(int l,int b){
        System.out.println("Area :" +(l*b));
    }
}
public class InterfaceIntro {
    public static void main(String [] args){
        Rectangle rect = new Rectangle();
        rect.getArea(3,5);
    }
}
