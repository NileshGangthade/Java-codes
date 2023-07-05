import java.util.*;
class  ButterflyParrern{
    Scanner sc = new Scanner (System.in);
    ButterflyParrern(){
        System.out.print("enter a number :");

        int n=sc.nextInt();

        for (int i=0; i<n; i++){
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            for (int j=1; j<n-i; j++){
                System.out.print(" ");

            }

            for (int j=1; j<n-i; j++){
                System.out.print(" ");

            }
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            
            System.out.println("  ");
        }


        for (int i=n-1; i>=0; i--){
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            for (int j=1; j<n-i; j++){
                System.out.print(" ");

            }

            for (int j=1; j<n-i; j++){
                System.out.print(" ");

            }
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            
            System.out.println("  ");
        }


    }
    // *    *
    // **  **
    // ******
    // ******
    // **  **
    // *    *
}
public class Pattern {
    public static void main(String[] args) {
        ButterflyParrern b = new ButterflyParrern();
        
    }
}
