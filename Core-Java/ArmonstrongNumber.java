public class ArmonstrongNumber {

    public static void checkNumber (int n){
        String s = "" + n;
        int temp=0;
        

        for (int i=0; i<s.length(); i++){
            int a = s.charAt(i) - '0';
            int c = 1;
            for (int j=0; j<s.length(); j++){
               c *= a;
            }

            temp += c; 


        }

        if (temp == n){
            System.out.println( n + " the number is armstrong "+ "(" + temp + ")");

        }

        else {
            System.out.println(n + " the number is not armstrong "+ "(" + temp + ")");
        }

     
    }
    public static void main(String[] args) {

       checkNumber(153);
        
    }
}
