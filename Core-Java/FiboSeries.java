import java.util.Scanner;

public class FiboSeries {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a=0;
        int b=1;
        int c;
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        
        for(int i=0; i<=n-2; i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;


        }
        sc.close();
    }
}
