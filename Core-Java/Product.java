import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int n = sc.nextInt();
        int pr =1;
        int []arr = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            
            pr = pr * arr[i] ;
        }

        for (int i = 1; i <=arr.length; i++) {
            int temp =pr;
            temp = temp/i;
            System.out.print(temp + " ");

        }
    }
    
}
