import java.util.Scanner;

public class Factorial {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner (System.in);
    //     System.out.println("Enter a number of factorial :");
    //     int n=sc.nextInt();
    //     int f=1;
    //     for (int i=1; i<=n; i++) {
    //         f = f*i;
           

    //     }

    //     System.out.println(f);
    //     sc.close();
    // }


    public static int fact(int a){
        if (a==0) {
            return 1;
        }
        return a * (a-1);
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(" Enter a number :");
        int a = sc.nextInt();
        System.out.println(" Factorial of the number :"+ fact(a));

     }
    
}
// 5,4,3,2,2,1
