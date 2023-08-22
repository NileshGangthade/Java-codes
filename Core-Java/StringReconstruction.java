public class StringReconstruction {
    public static void main(String[] args) {
        String input = "yourstring"; // Replace with the input string
        int m = 2; // Number of characters to remove/add by A
        int n = 3; // Number of characters to remove/add by B

        int turns = reconstructString(input, m, n, input, 0);
        System.out.println("It took " + turns + " turns to get back the original string.");
    }

    public static int reconstructString(String original, int m, int n, String current, int turns) {
        if (current.equals(original)) {
            return turns;
        }

        String reconstructedStrM = current.substring(current.length() - m) + current.substring(0, current.length() - m);
        String reconstructedStrN = current.substring(current.length() - n) + current.substring(0, current.length() - n);

        int turnsM = reconstructString(original, m, n, reconstructedStrM, turns + 1);
        int turnsN = reconstructString(original, m, n, reconstructedStrN, turns + 1);

        return Math.min(turnsM, turnsN);
    }
}
