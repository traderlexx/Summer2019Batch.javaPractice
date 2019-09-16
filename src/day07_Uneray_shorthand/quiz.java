package day07_Uneray_shorthand;

public class quiz {
	public static void main(String[] args) {
		
		int a=30;
		int b=(byte)a;
		System.out.println(b); //question 1 = 30
		
		//question2
		System.out.println("Result A"+0+1);
		// result A0+1 
		// result A01
		
		//question4
		System.out.println(";Result B" +(1)+(2));
		//"; Result B12
		System.out.println("5+2="+3+4);
		System.out.println("5+2="+(3+4));
		
		float floatNumber =100.98765432f;
		// short Short= Float; float larger then short 
		short ShortNum= (byte) floatNumber;//100
		
		System.out.println(ShortNum);
		
		// question 6
		 int Numa=200;
		 int  Numb=2;
		 
		 System.out.println(Numa+Numb-Numa*Numb+Numa/Numb);
		 // 200+2-400+100= -98
		  //QUESTION7
		 System.out.println((3+2)*2/3%2);
		 //                 5  *  2 / % 2 ===> 10/3%2 =1
		  // question 8 
		 
		 int num1=9, num2 =0, num3; //num1/num2;
		  // nominator cant be zero
		  
		  
		   //question 9
		  long Lnum=3_000l;
		  double Dnum= (float) Lnum;// Narrowing
		  int IntNum=(short) Dnum;//int, short 
		  
		
		  System.out.println(IntNum%1000);// ()3000%1000=0
		  
		  // Question 10
		  
		  double result1= 10/3;// result1=3.0
		  
		  
		  
		  
		 
		
		
		
		
		
				
		
	}

}
