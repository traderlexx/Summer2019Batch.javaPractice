package Day12;

public class switch_statement {
	public static void main(String[] args) {
		
	
	/* swith stament is semilar thing as "else if statement"
	 * Swith(Expression)
	 * case casevalue  
	 * statement 
	 * statement 
	 * break:
	 * 
	 */
	int  score =1;
	if (score ==1) {// must give boolean expression
		System.out.println("1");
	}
	else if (score==2) {
		System.out.println("2");
	}
	switch(score) {// must be an Expression: data 
	case 1:
		System.out.println("1");
		break;
	case 2:
		System.out.println("2");
		default: System.out.println("Invalid ");
		break;
		
		
	}
}
}