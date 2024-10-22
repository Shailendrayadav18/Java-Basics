package bitManipulation;

public class getBit {
    public static void main(String[] args) {
        int n=5;
        int position =2;
        int Bitmask = 1<<position;
        
        if((Bitmask & n)==0){
            System.out.println("Bit is 0");
        }else{
            System.out.println("Bit is 1");
        }
    }
}
