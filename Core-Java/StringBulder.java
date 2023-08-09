import java.util.Scanner;

public class StringBulder {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string :");
        //String name = scanner.nextLine();
        StringBuilder sb = new StringBuilder(scanner.nextLine());
        System.out.println(sb.reverse());
    
    }
}
