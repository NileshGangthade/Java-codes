public class MoveAllXToLast {
    public static void moveX(String x, int index ,int count, String newStr){
        
        if (index==x.length()){
            for (int i=1; i<=count; i++){
                newStr =newStr + 'x';
            }
            System.out.println(newStr);
            return;
        }
        if (x.charAt(index)=='X'||x.charAt(index)=='x'){
         count ++;
         moveX(x, index +1, count, newStr);
        }
        else {
             newStr = newStr + x.charAt(index);
             moveX(x, index +1, count, newStr);
        }
        
    }
    public static void main(String[] args) {
        String x = "aaxz";
        String newStr = "";
        
        moveX(x,0, 0, newStr);
        
    }
}
