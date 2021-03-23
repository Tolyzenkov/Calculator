import java.util.Scanner;

public class Input {
    public static String input;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        Parser.parse(input);

    }
}
