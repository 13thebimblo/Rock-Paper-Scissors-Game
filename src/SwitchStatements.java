import java.util.Scanner;

public class SwitchStatements {
    
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int i = 10;
        String s = in.nextLine();

        switch (s) {
            case "English":
                System.out.println("Hello!");
                break;
            case "French":
                System.out.println("Bonjour!");
                break;
            case "Spanish":
                System.out.println("¡Hola!");
                break;
            case "German":
                System.out.println("Hallo!");
                break;
            case "Gangsta":
                System.out.println("Say hello to my little friend!");
                break;
        }
    
    

    }

}
