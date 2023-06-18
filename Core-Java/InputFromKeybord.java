import java.util.Scanner;

public class InputFromKeybord {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    int a,b,c;
        System.out.println("Enter a two numbers :");
        sc.useRadix(2);
        a= sc.nextInt();
        b= sc.nextInt();
        
        c=a+b;
        String s="\u092E\u0930\u093E\u0920\u0940 \u092D\u093E\u0937\u093E \u092D\u093E\u0930\u0924\u093E\u091A\u094D\u092F\u093E \u092A\u094D\u0930\u093E\u091A\u0940\u0928 \u092D\u093E\u0937\u093E\u0902\u092A\u0948\u0915\u0940 \u090F\u0915 \u0905\u0938\u0942\u0928 \u092E\u0939\u093E\u0930\u093E\u0937\u094D\u091F\u094D\u0930\u0940 \u092A\u094D\u0930\u093E\u0915\u0943\u0924\u091A\u0947 \u0906\u0927\u0941\u0928\u093F\u0915 \u0930\u0942\u092A \u0906\u0939\u0947.";
        System.out.println("Additios is :"+c);
        System.out.println(s);

        sc.close();
    }
}
