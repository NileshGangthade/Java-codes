import java.util.*;
public class swapAstring {
    public  boolean swapAstring(String s, String goal){
        // char c = s.charAt(0);
        // char b = s.charAt(1);
        // char a []={b,c};
        // String n= new String(a);
        // System.out.println(c);
        // System.out.println(b);
        // System.out.println(n);
        if (s.charAt(1)==goal.charAt(0) && s.charAt(0)==goal.charAt(1)) {
            return true;
        }

        else{

            return false;
        } 
        
    }
    
}
class swap{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 1st string : ");
        String s= sc.next();
        System.out.println("Enter a 2st string : ");
        String goal= sc.next();
        swapAstring a=new swapAstring();
        System.out.println(a.swapAstring(s, goal));
        sc.close();
    }
}
