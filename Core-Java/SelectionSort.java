public class SelectionSort {
    public static void main(String[] args) {
        int []arr = {1,8,4,9,2,3};

        int temp;

        for (int i = 0; i < arr.length; i++) {
            int smallest =i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[smallest] > arr [j]){
                    smallest = j;
                }

                temp = arr[smallest];
                arr[smallest] =arr [i];
                arr [i] = temp;

            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr [i]+ "  ");
        }
    }
}
