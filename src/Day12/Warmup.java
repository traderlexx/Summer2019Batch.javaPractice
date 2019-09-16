package Day12;

public class Warmup {
public static void main(String[] args) {
	 
	/*
	 * declare 3 numbers 
	 * if n1 and n2 are equal=> n1&n2 are equal
	 * if n2 and n3 are equal=> n2&n3 are equal
	 * if n3 and n1 are equal=> n3&n1 are equal 
	 * if all equal=> are equal 
	 *  do not use single if statement 
	 *   if none of them equal =>  none of them equal 
	 */
	
	
	 int n1=10, n2=10, n3=10;
	 
	 if (n1==n2&& n1!=n3) {
		 System.out.println("n1 and n2 are equal");
	 }
	 else if (n2==n3&& n2!=n3) {
		 System.out.println("n2 and n3 are Equal");
	 }
	 else if (n3==n1 && n3!=n1) {
		 System.out.println("n3 and n1 are equal" );
		 
	 }
	 else if (n1==n2 && n2==n3 && n3==n1) {
		 System.out.println("All of them Equal");
	 }
	 
	 
	 else { 
		 System.out.println("none of them Equal");
	 
	 }
	// second way to resolve 
	 
		 int num1=5, num2=5, num3=5;
		 if (num1==num2 && num2==num3 ){
			 System.out.println("all of them Equal");
		 }
		 else if (num1==num2) {
			 System.out.println(" num1 and num2 are equal");
		 }
		 else if (num2 ==num3) {
			 System.out.println("num2 and num3 are equal");
		 }
		 else if (num1==num3 )
			 System.out.println("num1 and num3 are equal");
		 
		 else if (num2!=num3 && num3!=n1 ) {
			 System.out.println("None of them Equal");
		 }
		 else {
			 System.out.println("Invalid ");
		 }
		 
		 // third way
		 int A=10, B=20, C=30;
		 if (A==B && B==C) {
			 System.out.println("all of them Are Equal");
		 } 
		 else  if(A == B){
			 System.out.println("A equal to B");
		 }
		 else if (A==C) {
			 System.out.println("Aand C are Equal");
			 
		 }
		 else if (B==C) {
			 System.out.println("b and C are Equal");
			 
		 }
		 else {
			 System.out.println("all of them not Equal");
		 }
		 // multi branch if statement without curly braces 
		int  grade=72;
		 
	 if (grade <=100&& grade >=0);// Pre condition
		 if (grade>=90) 
			 System.out.println("A");
		 else if(grade >=80)
			 System.out.println("B");
		 else if (grade>= 70)
			 System.out.println("C");
		 else System.out.println(); // this else statement belongs to the "else "statement 
	  
		System.out.println("Invalid");	 // this is belongs to pre condition 
}

}
