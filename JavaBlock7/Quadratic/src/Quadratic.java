import java.io.*;
/**
 * Created by block7 on 9/28/16.
 */
public class Quadratic {
    public static String readLine(String prompt) {
        String line = null;
        Console c = System.console();
        if (c != null) {
            line = c.readLine(prompt);
        } else {
            System.out.print(prompt);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            try {
                line = bufferedReader.readLine();
            } catch (IOException e) {
                //Ignore
            }
        }
        return line;
    }


    /*public static void main(String[] args) {
        String inputA = readLine("Imput A");
        String inputB = readLine("Imput B");
        String inputC = readLine("Imput C");

        QuadraticEquation eq = new QuadraticEquation(inputA, inputB, inputC);
        // System.out.println(eq.discriminant());
        eq.printSolution();
    }*/
    static int factorial(int n) {
        int total = 1;
        if (n < 0){
            System.out.println("Invalid input");
            return -1;
        } else if (n == 0 || n == 1){
            return 1;
        } while (n > 1) {
            total = total * n;
            n = n-1;
        }
        return total;
    }

    public static void main(String[] args){
        String input = readLine("Factorial of: ");

        int n = Integer.valueOf(input);
        System.out.println(factorial(n));
    }
}
