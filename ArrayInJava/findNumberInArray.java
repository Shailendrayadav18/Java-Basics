package ArrayInJava;

import java.util.Scanner;

public class findNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();            
        }

        int x = sc.nextInt();

        int i=0;
        while(x != arr[i]){
            if(i==size){
                System.out.println("Number not found");
                break;
            }
            i++;
        }
        if(i<size){
            System.out.println("Number found at "+i);
        }
    }
}
