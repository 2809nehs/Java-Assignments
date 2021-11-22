package Abstraction;

public abstract class Bank {

    public abstract void denominations();

}

 class hdfcbank extends Bank{

     @Override
     public void denominations() {
         System.out.println("Denominations in hdfc: 500,2000");
     }
 }
 class sbibank extends Bank{

     @Override
     public void denominations() {
         System.out.println("Denominations in SBI bank: 2000,100,500");
     }
 }

 class icicibank extends Bank{

     @Override
     public void denominations() {
         System.out.println("Denominations in ICICI bank: 100,200,500,2000");
     }
 }

 class main{
     public static void main(String[] args) {

         hdfcbank hd=new hdfcbank();
         hd.denominations();

         sbibank sbi=new sbibank();
         sbi.denominations();

         icicibank ic=new icicibank();
         ic.denominations();


     }
 }
