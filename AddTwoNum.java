import java.util.*;
public class AddTwoNum {
    public static int add(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a =scanner.nextInt();
        int b =scanner.nextInt();
        int sum = add(a, b);
        System.out.println(sum);
        scanner.close();
    }
}
