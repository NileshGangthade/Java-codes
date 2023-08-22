import java.util.Scanner;

public class ForestEsc {

    public static int result( int m){
        int res =1;
        int length =0;
        for (int i=1; i<=m; i++){
            int temp = i;
            int len =0;
            while (temp !=1){
                System.out.print(temp +"->");
                 if (temp % 2 == 0)
                    temp = temp / 2;
                else
                    temp = (3 * temp) + 1;
                len++;
                
            }
            System.out.println();

            if (len >length) {
                length = len;
                res =i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println(result(m));


    }
}
