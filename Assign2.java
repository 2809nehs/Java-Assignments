import java.util.Scanner;

public class Assign2 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Input a character");
        char c=sc.next().charAt(0);

        if (Character.isUpperCase(c)) {
            System.out.println("Character is in Uppercase!");
        }else {
            System.out.println("Character is in Lowercase!");
        }
    }
}
