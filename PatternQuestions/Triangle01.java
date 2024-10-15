package PatternQuestions;

public class Triangle01{
    public static void main(String[] args) {
        int n = 5;

        for(int i=1; i<=n; i++){
            if(i%2!=0){
                int number=1;
                for(int j=1; j<=i; j++){
                    System.out.print(number);
                    if(number==1){
                        number=0;
                    }
                    else{
                        number=1;
                    }
                }
            }
            else{
                int number=0;
                for(int j=1; j<=i; j++){
                    System.out.print(number);
                    if(number==1){
                        number=0;
                    }
                    else{
                        number=1;
                    }
                }
            }
            System.out.println();
        }
    }
}