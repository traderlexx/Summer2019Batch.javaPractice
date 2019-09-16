package Replit;

import java.util.Scanner;

public class Shoppinglist022 {
  public static void main(String[] args) {
	

 Scanner input = new Scanner(System.in);
 String  item1,item2,item3,report;
 double price1, price2, price3, totalPrice;
  
  System.out.println("Enter Item1 and its price: ");
       item1=input.next();
       price1=input.nextDouble();
  System.out.println("Enter Item2 and its price: "); 
       item2=input.next();
       price2=input.nextDouble();
  System.out.println("Enter Item3 and its price ");   
       item3=input.next();
       price3=input.nextDouble();
  totalPrice=(price1+price2+price3);
  System.out.println("Item1:"+" "+item1+"Price:"+price1+","+"Item2:"+" "+item2+"Price:"+price2+","+"Item3:"+" "+item3+"Price:"+price3);
  System.out.println("Total price:"+totalPrice);
  
  
       
 
  

}
}