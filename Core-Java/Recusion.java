class Recusion {
    public static int sum(int x) {
       int s;

        if(x==0) {
            return 0;
        }
        if(x==1) {
            return 1;
        }
       
        return x + sum(x-1);
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
        
    }
}