package functionsInJava;

import java.util.*;

public class calculateFactorial {
    public static int returnFactorial(int a){
        int fact = 1;
        while(a>=1){
            fact= a*fact;
            a--;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int fact = returnFactorial(a);
        System.out.println("Factorial of given number is :"+fact);
    }
}
