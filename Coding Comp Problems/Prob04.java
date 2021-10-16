import java.util.*;
public class Prob04 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());
            for (int testcase = 0; testcase < testCases; testcase++) {
                String inline = input.nextLine();
                inline = inline.toLowerCase();
                System.out.println(inline);
            }
        }
    }
}