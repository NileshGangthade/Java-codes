import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Welcome to Calculator");
        System.out.println("Enter a total numbers :");
        int total = sc.nextInt();
        System.out.println("1 . Addition");
         System.out.println("2 . Substraction");
          System.out.println("3 . Multiplication");
           System.out.println("4 . Division");

           System.out.println("Enter Action to Be perform :");
           int action = sc.nextInt();
            System.out.println("Enter Element :");
            int arr[] = new int[total];
            for (int i = 0; i <arr.length; i++){
                arr[i] =sc.nextInt();
            }


           System.out.println(actions(arr, action));
    }
   /**
 * @param arr
 * @param action
 * @return
 */
static int actions(int arr[], int action){
    int sum = 0 ;
    switch(action){
        case 1:{
            
            for (int i = 0; i < arr.length; i++){
                sum += arr[i];
                return sum;
            }
        }
        case 2:{
            
            for (int i = 0; i < arr.length; i++){
                sum -= arr[i];
                return sum;
            }
        }
        case 3:{
            
            for (int i = 0; i < arr.length; i++){
                sum *= arr[i];
                return sum;
            }
        }
        case 4:{
            
            for (int i = 0; i < arr.length; i++){
                sum /= arr[i];
                return sum;
            }
        }
        
    }

    return 0;

    }
}
