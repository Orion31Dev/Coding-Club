//Split word
import java.util.Arrays;
import java.util.*;
public class Prob02 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());
            for (int testcase = 0; testcase < testCases; testcase++) {
                String nextline = input.nextLine();
                String[] inputline = nextline.split(" ");
                String word = inputline[0];
                String index = inputline[1];
                String finalword = word.substring(Integer.parseInt(index) + 1);
                System.out.println(finalword);
            }
        }
    }
}