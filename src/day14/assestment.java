package day14;

public class assestment {
	public static void main(String[] args) {
		   
		String StatusCode= "900";
		   switch (StatusCode) {
		          case "200":
		               System.out.println("OK");
		               break;
		          case "201":
		        	   System.out.println("Created");
		        	   break;
		          case "202":
		        	   System.out.println("Accepted");
		        	   break;
		          case "301":
		        	   System.out.println("Moved Permanently");
		        	   break;
		          case "303":
		        	   System.out.println("See Others");
		        	   break;
		          case "304":
		        	   System.out.println("Not Modified");
		        	   break;
		          case "307":
		        	   System.out.println("Temporary Redirect ");
		        	   break;
		          case "400":
		        	   System.out.println("Bad request");
		        	   break;
		          case "401":
		        	   System.out.println("Unathorised");
		        	   break;
		          case "403":
		        	   System.out.println("Forbidden");
		        	   break;
		          case "404":
		        	   System.out.println("Not Found");
		        	   break;
		          case "410":
		        	   System.out.println("Gone");
		        	   break;
		          case "500":
		        	  System.out.println("Internal Service error");
		        	  break;
		          case "503":
		        	  System.out.println("Service Unavailable ");
		        	  default :
		        		  System.out.println("Screw UP");
		   }
		          
		   String day = "Sunday";
		   switch (day) {
		       case "Monday":
		             System.out.println("Java Class");
		             break;
		       
		       case  "Tuesday":
		             System.out.println("Java Class");
		             break;
		       case  " Wednesday":
		    	     System.out.println("SQL class");
		    	     break;
		       case  "Thursday":
		    	     System.out.println("Selenium Classes");
		    	     break;
		       case  " Friday":
		    	     System.out.println("Selenium Classes");
		    	     break;
		       case  "Saturday":
		    	     System.out.println("SQL Classes");
		    	     break;
		     default: 
		    	     System.out.println("Day off");
		   }      	  
		          
	}
	}


