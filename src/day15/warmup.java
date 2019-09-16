package day15;

public class warmup {
	public static void main(String[] args) {
		int  num=8;
		String result= "";
		if (num>=0 && num<=9) { 
			if(num==9)
			   result ="Nine";
			else if(num==8)
		       result="eight";
		    else if(num==7)
		       result="seven";
		    else if(num==6)
		    	result="six";
		    else if (num==5)
		    	result="five";
		    else if (num==4)
		    	result="four";
		    else if (num==3)
		    	result="three";
		    else if (num==2)
		    	result ="two";
		    else if (num==1)
		    	result="one";
		    else 
		    	result ="zero";
			
		} else  {result ="invalid";
		
		 }System.out.println(result);
		 
		 
		 
		 int N=7;
		 String result2 =(N==9) ?  "nine"  :(N==8)? "eight"
				        :(N==7) ?  "seven" :(N==6)? "six"
				        :(N==5) ?  "five"  :(N==4)? "four"
				        :(N==3) ?  "three" :(N==2)? "two"
				        :(N==1) ?  "one"   :(N==0)? "zero":"invalid";
		 System.out.println(result2);
				        		
				        		
				        
			  
		 
		}
	
	}




