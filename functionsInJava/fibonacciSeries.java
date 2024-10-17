package functionsInJava;

import java.util.*;

public class fibonacciSeries{
    public static void printFibonacciSeries(int n){
        int previous=0;
        int present=1;
        System.out.print(previous+" ");
        System.out.print(present+" ");
        for(int i=1; i<=n-2; i++){
            int next = present + previous;
            System.out.print(next+" ");
            previous=present;
            present=next;
            
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFibonacciSeries(n);
    }
}