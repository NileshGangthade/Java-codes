
public class PrintZeroAtLast {
    public static void main(String[] args) {
        int arr[]={1,1,2,3,0,1,0};
        int a=arr[0];
        int j=arr[arr.length-1];
        int k=0;
        // System.out.print(a + " " + j);

        for (int i=0;i<arr.length;i++) {
            if (arr[i]==0) {
                k++;
            }
            else  {
                System.out.println(arr[i]);
            }
            
        }
        for (int i=1;i<=k;i++) {
            System.out.println(0);
        }
    
}
}
