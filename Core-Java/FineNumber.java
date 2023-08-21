import java.util.*;
public class FineNumber {

    public static int result(int n, int m, int a[], int b[] ){
        int diff =0;
        Arrays.sort(a);
        Arrays.sort(b);

        int temp1 = Math.abs(a[0]-b[m-1]);
        int temp2 = Math.abs(a[n-1]-b[0]);

        if(temp1 >= temp2){
            diff =temp1;
        }
        else 
            diff =temp2;

        return diff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
         int a []= new int[n];
         int b []= new int[m];

         for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
         }
         for (int i = 0; i < m; i++){
            b[i] = sc.nextInt();
         }

         System.out.println(result(n, m, a, b));
        
    }
}
