import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        String operation;
        double num1;
        double num2;
        double result;

        Scanner sc=new Scanner(System.in);

        // asking for operation to perform
        System.out.println("Choose an operation to perform: add, sub, mul or div ");
        operation=sc.nextLine();

        System.out.println("Enter first number");
        num1=sc.nextInt();

        System.out.println("Enter second number");
        num2=sc.nextInt();

        switch (operation){
            // addition of 2 numbers
            case "add":
                result=num1+num2;
                System.out.println("Addition of 2 numbers is " + result);
                break;
            case "sub":
                result=num1-num2;
                System.out.println("Subtraction of 2 numbers is " + result);
                break;
            case "mul":
                result=num1*num2;
                System.out.println("Addition of 2 numbers is " + result);
                break;
            case "div":
                result=num1/num2;
                System.out.println("Addition of 2 numbers is " + result);
                break;

            default:
                System.out.println("Invalid input");
                break;



        }



    }
}
