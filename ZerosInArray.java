import java.util.*;
class PrintZerrosAtStart {
    public PrintZerrosAtStart(int []arr){
        for(int i=0; i<arr.length; i++){
            if (arr [i]==0){
                    continue;
                }
            for(int j=arr.length-1; j>0; j--) {
                if (i==j) {
                    break;
                }
                
                if (arr[j]==0){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

                }  
            }
            
        }
        for (int j=0; j<arr.length;j++) {
                System.out.print(arr[j] + " ");
        }
    }
}
public class ZerosInArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of array :");
        int size = sc.nextInt();
        System.out.println("Enter a element :");
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr [i]= sc.nextInt();
        }

        PrintZerrosAtStart a = new PrintZerrosAtStart(arr);
    }
}
