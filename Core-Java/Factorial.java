import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number of factorial :");
        int n=sc.nextInt();
        int f=1;
        for (int i=1; i<=n; i++) {
            f = f*i;
           

        }

        System.out.println(f);
        sc.close();
    }
    
}
// 5,4,3,2,2,1
