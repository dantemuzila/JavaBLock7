import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by block7 on 11/28/16.
 */
public class SkillDrillMain {
    static int calculateFib(int FibTerm){
        if (FibTerm == 1 || FibTerm == 0){
            int FibValue = 1;
            return FibValue;
        }
        else if (FibTerm > 1){
            int FibValue = calculateFib(FibTerm - 2) + calculateFib(FibTerm - 1);
            return FibValue;
        }
        return FibTerm;
    }
    public static void triangle(int asteric){
        for (int i = 0; i < asteric; i++){
            for (int a = 0; a < i; a++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = asteric; i > 0; i--){
            for (int a = 0; a < i; a++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static int numberSum(int num1, int num2){
        return num1 + num2;
    }
    static int numberType(int num){
        if (num % 2 == 0){
             System.out.println(num + " is an even number");
        }
        else {
            System.out.println(num + " is an odd number");
        }
        return num;
    }
    public static int numberLine(int n){
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ",");
        }
        return n;
    }

    public static void main(String[] args){
        System.out.print("The Fibonacci number is " + calculateFib(6));
        triangle(10);
        System.out.println(numberSum(3,5));
        numberType(5);
        numberLine(6);
    }
}
