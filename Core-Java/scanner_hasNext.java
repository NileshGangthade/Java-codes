import java.util.Scanner;
class scanner_hasNext {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineNumber = 1;
        while(scanner.hasNext()){
            String lineContent = scanner.nextLine();
            System.out.println(lineNumber + " " + lineContent);
            lineNumber++;
        }
        scanner.close();
    }
}

