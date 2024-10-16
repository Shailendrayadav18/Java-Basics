package functionsInJava;

import java.util.Scanner;

public class Multiply {
    public static int multiplyTwoNumber(int a, int b){
        int mul = a*b;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

        int mul = multiplyTwoNumber(a, b);
        System.out.println("Multiplication of two numbers:"+mul);
    }
}
