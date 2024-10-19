package CodeVitaProblems;

import java.util.Scanner;

public class boardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] grid = new int[M][N];

        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                grid[i][j] = sc.nextInt();
            }
        }
        int source[]= new int[2];

        for(int i=0; i<2; i++){
            source[i]= sc.nextInt();
        }

        int destination[]= new int[2];
        for(int i=0; i<2; i++){
            destination[i]= sc.nextInt();
        }

        int move[]= new int[2];
        for(int i=0; i<2; i++){
            move[i] = sc.nextInt();
        }
        int tempDestination[] = new int[2]; 

        //forward move
        while (source[0]!=destination[0] && source[1]!=destination[1]) { 
            source[0]=source[0]+move[0];
            source[1]=source[1]+move[1];
            tempDestination[0]= destination[0] - source[0];
            tempDestination[1]= destination[1] - source[1];
            int min = tempDestination[0]+tempDestination[1];

            // right move
            source[0] =source[0]+move[1];
            source[1] = source[1]-move[0];
            
                      
        }
    }
}
