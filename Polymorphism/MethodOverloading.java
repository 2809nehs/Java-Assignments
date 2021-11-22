package Polymorphism;

public class MethodOverloading {

    public void largestofnum(int num1, int num2){
        if(num1>=num2){
            System.out.println("Largest number is: "+num1);
        }
        else{
            System.out.println("Largest number is: "+num2);
        }

    }

    public void largestofnum(int num1,int num2,int num3){
        if(num1>=num2 && num1>=num3){
            System.out.println("Largest number is: "+ num1);
        }
        else if(num2>=num1 && num2>=num3){
            System.out.println("Largest number is: "+ num2);
        }
        else{
            System.out.println("Largest number is: "+ num3);
        }

    }

    public static void main(String[] args) {
        MethodOverloading mo=new MethodOverloading();
        mo.largestofnum(4,6);
        mo.largestofnum(8,2,4);
    }
}
