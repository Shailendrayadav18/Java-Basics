package PatternQuestions;

public class floydsTriangle{
    public static void main(String[] args) {
        int n=5;
        int add = 1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(add+" ");
                add++;
            }
            System.out.println();
        }
    }
}