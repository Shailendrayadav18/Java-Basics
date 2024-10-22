package StringsInJava;

public class substring {
    public static void main(String[] args) {
        String sentence = "My name is Monu Yadav";
        String name= sentence.substring(11, sentence.length());

        System.out.println(name);

        //Strings are immutable
    }
}
