package ArrayInJava.twoDArray;

import java.util.*;

public class findANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int colms = sc.nextInt();
        int array[][] = new int[rows][colms];
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<colms; j++){
                array[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<colms; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
