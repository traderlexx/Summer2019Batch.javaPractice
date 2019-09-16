package Day10_if_Statement;

public class Single_if_statement {
	public static void main(String[] args) {
     int grad = 85;
    if (grad>=90 ) { // need add && grade<= 100 its will be bug free code 
    	System.out.println( "Your score is A");//91 92 93....99
    	
    }
    else if(grad >=80 &&  grad <90) {
		System.out.println( "your score is B");// 81.82.83.89
		
	}
    else if( grad >=70 && grad <80) {
		 System.out.println( "you score is  C");// 71.72.73...79
	 }
	 else if ( grad >=60 && grad < 70) {
			System.out.println("Your score is  D"); // 61.62....69
		}
		else   {
		System.out.println(" your score is F"); 
		
	
				
			}
    
    
    // find bug 
   /*
    * task 2 
    *  write  program that :
    *  1. 0-12 ==> Gppd Morning 
    *  2. 12-15 ==> is Good Afternoon 
    *  3. 15-24 ==> is Good Evening 
    *  
    */
    
    int hour =23;
    		if(hour >=0 && hour <=12) {
    			System.out.println("Good morning");
    			}
    		else if (hour >15 &&  hour <=15) {
    			System.out.println("Good Afternoon ");
    		}
    		else if ( hour > 15 && hour <=24 ); {
    			System.out.println( "Good Evening ");
    			
    		}
    		
    		
    		
    	 int  grade=55;
    	 boolean A=grade>=90&& grade<=100;
    	 boolean B=grade>=80&& grade<=89;
    	 boolean C=grade>=70&& grade<=79;
    	 boolean D=grade>=60&& grade<=69;
    	 boolean F=grade>=50&& grade<=59;
    	 if (A) {
    		 System.out.println( "You made A");
    	 }
    	 
		}
	
	
	
	
	
	
		
	}

