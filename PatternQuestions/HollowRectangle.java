package PatternQuestions;

public class HollowRectangle {
    public static void main(String[] args) {
        int n = 5;
        int m = 4;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i==1 || j==1 || j==m || i==n){
                    System.err.print("*");
                }else{
                    System.err.print(" ");
                }
            }
            System.err.println();
        }
    }
}
