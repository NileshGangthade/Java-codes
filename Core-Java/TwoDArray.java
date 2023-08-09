import java.util.*;
public class TwoDArray {


    public static void inputArr(int x, int y){
        Scanner sc = new Scanner(System.in);
       int [][]arr = new int [x][y];
        for (int i=0;i<x;i++){
            for (int j=0;j<y;j++){
                arr[i][j] = sc.nextInt();

            }
        }
        System.out.print("Enter number to find :" );
        int a=sc.nextInt();

        for (int i=0;i<x;i++){
            for (int j=0;j<y;j++){
                if (a == arr [i][j]){
                    System.err.println("Element found at index (" + i + "," + j+ ")");

                }

            }
        }

    }
     
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of rows :" );
    int x =sc.nextInt();
    System.out.print("Enter number of colums :" );
    int y =sc.nextInt();

    inputArr(x, y);

    




        
    }
}
