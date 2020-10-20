package assignmentsSimpliLearn;

import java.util.Scanner;

public class ForLoop {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
	    int num; // To hold number
	    int fact = 1; // To hold factorial
	 while(true){
	    System.out.println("Enter the factorial number ");
	    num=console.nextInt();
	    for(int i=1; i<=num; i++){
	    	
	    	fact=fact * i;
	    	
	    }
	    System.out.println("The factorial of number is "+fact);
	    
	    System.out.println("");
	 }
	   
	    
	   
	}

}
