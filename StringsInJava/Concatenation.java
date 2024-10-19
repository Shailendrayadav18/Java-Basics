package StringsInJava;

import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstname = sc.next();
        String lastname = sc.next();

        String fullname = firstname + " " + lastname;

        System.out.println(fullname);
        System.out.println(fullname.length());
    }
}
