import java.util.HashSet;

public class UniqueSubStr {

    public static void subStr(String str, int index, String newStr ,HashSet<String> set){

        if (index == str.length()){
            if (set.contains(newStr)){
                return;

            }
            else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        // add char 
        subStr(str, index+1, newStr + str.charAt(index), set);

        // or not add char
                subStr(str, index+1, newStr, set);

    }
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        subStr("aaa",0,"",set);
        
    }
}
