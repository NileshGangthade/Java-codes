public class CalSum {

    public static int sum (int arr []) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int temp ;
            temp = sum - arr[i];

            if (temp == arr[i]){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr [] = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2};

        System.out.println(sum(arr));



    }
}
