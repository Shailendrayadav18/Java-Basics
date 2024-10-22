package bitManipulation;

import java.util.Scanner;

public class updateBit {
    public static void main(String[] args) {
        int n=5;
        Scanner sc =new Scanner(System.in);
        int operation = sc.nextInt();
        int position = 2;
        int bitMask = 1<<position;

        if(operation==1){
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }else{
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
}
