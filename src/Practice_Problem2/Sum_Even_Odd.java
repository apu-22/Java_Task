package Practice_Problem2;

public class Sum_Even_Odd {
    public static void main(String[]args){
        System.out.println("Sum of even number using loop:");
        int sum=0;
        for(int i=2;i<=20;i+=2){
            sum+=i;
        }
        System.out.print("The even sum is: " +sum);

        System.out.println();
        System.out.println("Sum of odd number using loop:");
        sum=0;
        for(int i=1;i<=20;i+=2){
            sum+=i;
        }
        System.out.print("The odd sum is: " +sum);
    }
}
