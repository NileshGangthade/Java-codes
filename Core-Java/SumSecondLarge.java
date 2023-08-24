import java.util.Arrays;

public class SumSecondLarge {

    public static int calSum( int arr [], int l){
        int secondLargOdd ;
        int secondLargEven ;
        if ((arr.length) % 2 == 0){
            //int firstEven = arr[arr.length-1];
            secondLargEven = arr[l-3];
            secondLargOdd = arr[l-4];

        }
        else {
            secondLargEven = arr[l-4 ];
            secondLargOdd = arr[l-3 ];
        }
        return (secondLargEven + secondLargOdd);
    }

    public static int kapilLogic (int arr[] ){
        int firstOdd = 0;
        int secondOdd =0;
        int firstEven = 0;
        int secondEven = 0;

        for (int i=0; i<arr.length; i+=2){
            
            if (arr[i] > firstOdd){
                secondOdd = firstOdd;
                firstOdd = arr[i];
            }
        }
        for (int i=1; i<arr.length; i+=2){
           
            if (arr[i] > firstEven){
                secondEven = firstEven;
                firstEven = arr[i];
            }
        }
        System.out.println( secondOdd + " " + secondEven);
        return (secondEven + secondOdd);
    }
    public static void main(String[] args) {
        int arr []= {12,7,18,90,23,55,16,81,56};

        Arrays.sort(arr);
        //System.out.println(calSum(arr, arr.length));

        System.out.println(kapilLogic(arr));
        


    }
}
