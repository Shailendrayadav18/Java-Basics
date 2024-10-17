package ArrayInJava;

import java.util.Scanner;

public class marksInSubjects {
    public static void main(String[] args) {
        int[] marks= new int[3];
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            marks[i]=sc.nextInt();                        
        }
        for (int i = 0; i < 3; i++){
            System.out.print(marks[i]+" ");   
        }
    }
}
