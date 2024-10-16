package PatternQuestions;

public class PalindromicPattern {
    public static void main(String[] args) {
        int n =5;
        for (int i = n; i >= 1; i--) {
            for(int j =1; j<=i-1; j++){
                System.out.print(" ");
            }
            for(int j=i; j<=n; j++){
                System.out.print(n-j+1);
            }
            for(int j=1; j<=n-i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
