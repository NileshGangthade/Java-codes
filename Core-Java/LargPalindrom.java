import java.util.Arrays;

public class LargPalindrom {

    public static int findPalindrom (int arr[], int n){
        if (arr.length < 0){
            
             return -1;

        }
         String temp1 = Integer.toString(arr[n]);
         StringBuilder temp2 = new StringBuilder(temp1);
          temp2.reverse();
        if(temp1.equals(temp2.toString())){
           return arr[n];
         }
         else{
            return findPalindrom(arr, n-1);
         }

      
    }

    public static int diffInEvenPalindrom (int arr[], int n){

        int maxEven = arr [0], maxOdd = arr [0];
        int res1 , res2;
       for (int i=0 ; i<n ; i++){
            if (arr[i] %2 ==0){
                if (arr[i] > maxEven){
                    maxEven = arr[i];
                    String temp1 = Integer.toString(arr[n]);
                    StringBuilder temp2 = new StringBuilder(temp1);
                    temp2.reverse();
                    if(temp1.equals(temp2.toString())){
                    return res1 = arr[i];
                }

                }
               
            }
            else {
                
                if (arr[i] > maxOdd){
                    maxOdd = arr[i];
                    String temp1 = Integer.toString(arr[n]);
                    StringBuilder temp2 = new StringBuilder(temp1);
                    temp2.reverse();
                    if(temp1.equals(temp2.toString())){
                    return res2 = arr[i];
                }

                }

            }

       }
        return -1;
    }
    public static void main(String[] args) {
         int [] arr = {10, 23, 5, 999991};
         Arrays.sort(arr);
         //System.out.println(findPalindrom(arr ,arr.length-1));
         //System.out.println(findPalindrom(arr, 0));

         System.out.println(diffInEvenPalindrom(arr, arr.length));
         


    }
}
