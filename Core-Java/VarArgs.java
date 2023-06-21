public class VarArgs {
   static int sum(int... args){
    int sum = 0;
    for (int e : args) {
        sum += e;
        
    }
    return sum;

    }
    public static void main(String[] args) {
        int a=5;
        int b=4;
        int c=3;
        int d=2;
        System.out.println("sum is "+sum(a,b,c,d));
    }
}
