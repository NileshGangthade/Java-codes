import java.util.*;
public class RemoveDuplicate {
    public static void removeDup (String str, int i, String newstr, HashSet<String> set){
       if (i == str.length() - 1){
        System.out.println(newstr);
        return;
       }
        //String c += str.charAt(i);
        if (set.contains(str.charAt(i))){
          removeDup (str, i+1, newstr, set);
        }
        else {
            set.add(c);
           removeDup (str, i+1, newstr, set);
        }
        
    

    }
    public static void main(String[] args) {
        String str = "acsazcaabbz";
        HashSet<String> set = new HashSet<String>();
        removeDup(str,0, "", set);

    }
}
