import java.util.Scanner;

public class PrintMyName {
    public static void name (String name) {
        System.out.println(name);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name= sc.nextLine();
        name(name);
        
    }
}
