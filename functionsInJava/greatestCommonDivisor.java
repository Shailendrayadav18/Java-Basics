package functionsInJava;

import java.util.Scanner;

public class greatestCommonDivisor {
    public static int returnGreatestDivisor(int a, int b){
        if(a>b){
            for(int i=b; i>=1; i--){
                if(b%i==0 && a%i==0){
                    return i;
                }
            }
        }
        else{
            for(int i=a; i>=1; i--){
                if(a%i==0 && b%i==0){
                    return i;
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();

        int value = returnGreatestDivisor(a, b);
        System.out.println("Greatest common divisor is:"+value);
    }
}
