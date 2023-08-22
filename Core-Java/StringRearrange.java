public class StringRearrange {

    public static int reconstructString(String original, int m, int n, String current, int turns) {
        if (current.equals(original)) {
            return turns;
        }

        String reconstructedStrM = current.substring(current.length() - m) + current.substring(0, current.length() - m);
        //String reconstructedStrN = current.substring(current.length() - n) + current.substring(0, current.length() - n);

        int turnsM = reconstructString(original, m, n, reconstructedStrM, turns + 1);
        int turnsN = reconstructString(original, m, n, reconstructedStrM, turns + 1);

        return Math.abs(turnsM + turnsN);
    }

    public static void main(String[] args) {
        String input = "yourstring"; 
        int m = 1;
        int n = 2;

        int turns = reconstructString(input, m, n, input, 0);

        System.out.println(turns);
    }
    
}
