package Practice_Problem2;

public class Print_Even_Odd {
    public static void main(String[] args){
        System.out.println("Using for loop for even numbers:");
        for(int i=2;i<=20;i+=2){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Using while loop for even numbers:");
        int i=2;
        while(i<=20){
            System.out.print(i + " ");
            i+=2;
        }
        System.out.println();

        System.out.println("Using do-while loop for even numbers:");
        i=2;
        do{
            System.out.print(i + " ");
            i+=2;
        }while (i<=20);
        System.out.println();

        System.out.println("Using for loop for odd numbers:");
        for(i=1;i<=20;i+=2){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Using while loop for odd numbers:");
        i=1;
        while(i<=20){
            System.out.print(i + " ");
            i+=2;
        }
        System.out.println();

        System.out.println("Using do-while loop for odd numbers:");
        i=1;
        do{
            System.out.print(i + " ");
            i+=2;
        }while (i<=20);
    }

}