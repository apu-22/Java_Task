package Practice_Problem3;

public class Fibonacci {
    public static void main(String[]args){
        int term=12;
        int first=0,second=1;
        System.out.print(first + "," + second);

        for(int i=3;i<=term;i++){
            int next = first+second;
            System.out.print("," + next);

            first=second;
            second=next;
        }
    }
}