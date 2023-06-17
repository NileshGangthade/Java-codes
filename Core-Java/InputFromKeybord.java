import java.util.Scanner;

public class InputFromKeybord {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    int a,b,c;
        System.out.println("Enter a two numbers :");
        a= sc.nextInt();
        b= sc.nextInt();
        c=a+b;
        System.out.println("Additios is :"+c);

        sc.close();
    }
}
