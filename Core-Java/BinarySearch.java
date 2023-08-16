class BinarySearch {

    public static void recursionSerch(int arr[], int start, int end, int element){
        int mid = (start + end)/2;

       
        if (start>end ){
            System.out.println("Element not found");
            return;
        }
        if(arr[mid]== element){

            System.out.println( element+" found at index "+mid);
            return;

        }

        if (element > arr[mid] ){
            recursionSerch(arr, mid+1, end, element);
        }
        if (element < arr[mid] ){
            recursionSerch(arr, start, mid-1, element);
        }
    }
        

    

    public static void iteratationMethod(int arr[], int start, int end, int element){
         while(start <= end){
        int mid = (start + end)/2;
            
        
         if(arr[mid] == element){
            System.out.println( element+" found at index "+mid);
            return;
        }

        if (element > arr[mid] ){
            start = mid+1;
        }
        if (element < arr[mid] ){
            end = mid -1;
        }
    }

    System.out.println("element not found");

    }
    public static void main(String[] args) {
        int arr []={1,5,6,8,10,13,45,67};

        recursionSerch(arr, 0, arr.length -1, 67);
        iteratationMethod(arr, 0, arr.length-1, 1);
    }
}