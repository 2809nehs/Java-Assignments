package Polymorphism;

import java.util.Scanner;

public class MethodOverriding {


    public void sum() {
        int num1 = 2;
        int num2 = 3;
        System.out.println("Sum of 2 numbers is: " + (num1 + num2));
    }
}

    class Overriding extends MethodOverriding {

        public void sum() {
            String s1 = "hi";
            String s2 = "neha";
            System.out.println("String is: " + (s1 + s2));

        }
    }

    class Application {
        public static void main(String[] args) {
            MethodOverriding mo = new MethodOverriding();
            mo.sum();
            Overriding or = new Overriding();
            or.sum();

        }
    }


