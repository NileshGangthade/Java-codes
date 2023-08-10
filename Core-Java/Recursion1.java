import java.util.Scanner;

public class Recursion1 {
    public static int  printNumber(int a){
        if (a ==0){
            return 1;
        }
       
       int sum =a;
       sum *= printNumber(a-1);
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int a = scanner.nextInt();
        System.out.println(printNumber(a));

    }
}
