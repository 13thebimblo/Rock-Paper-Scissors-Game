import java.util.Scanner;

public class StringMethods {

    public static void main(String[] args) {

        String s = "Reginald";

        System.out.println(s.replace("ginald", "imbursed").toUpperCase());
        System.out.println(s.substring(2, 6));
        System.out.println(s.substring(s.indexOf("a"), s.indexOf("a") + 2));
        

    }

}