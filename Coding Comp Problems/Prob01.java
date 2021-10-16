//Line Echoes
import java.util.*;

public class Prob01 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());
            for (int testcase = 0; testcase < testCases; testcase++) {
                String linetoecho = input.nextLine();
                System.out.println(linetoecho);
            }
        }
    }
}