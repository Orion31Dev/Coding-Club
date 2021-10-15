import java.util.Scanner;

public class Prob00 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());
            for (int testcase = 0; testcase < testCases; testcase++) {
                int numbertoinput = Integer.parseInt(input.nextLine());
                if(numbertoinput % 2 == 0){
                    System.out.println("Number is even!");
                }
                else{
                    System.out.println("Number is not even!");
                }
            }
        }
    }
}
