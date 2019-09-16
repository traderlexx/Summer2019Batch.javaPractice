package Day10_if_Statement;

public class review {
public static void main(String[] args) {
	

	 int  grade=55;
	 boolean A =grade>=90&& grade<=100;
	 boolean B =grade>=80&& grade<=89;
	 boolean C =grade>=70&& grade<=79;
	 boolean D =grade>=60&& grade<=69;
	 boolean Validgrade = grade>=0&&grade<=100;
	 
	 
	 
	 if (A) {
		 System.out.println( "You made A");//100>grade>=90
	 }
	 else if (B) {
		 System.out.println("you made B");// 90> grade>80
		 
	 }
	 else if (C) {
		 System.out.println("You made C");// 80> grade>=70
	 }
		 
	 else if (D) {
		 System.out.println( "You made D");// 70>grade>=60
		 
	 }
	 else {
		 System.out.println("you made F"); //0<=grade<60
	 }
	 
	 /*
	  * Nested If 
	  */
	 }
	 
	 }	

