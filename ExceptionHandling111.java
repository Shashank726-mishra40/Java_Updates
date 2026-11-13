import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int pin = sc.nextInt();
	int n = pin;
	int c = 0;
	while(n!=0){
	    c++;
	  n = n/10;  
	}
	try{
	    if(c!=4){
	        throw new Exception("Invalid PIN");
	    }
	    System.out.println("PIN Verified");
	}
	catch(Exception e){
	    System.out.println(e.getMessage());
	   
	}
	finally{
	    System.out.println("Operation Completed");
	}
	}
}


// Exception handling is important because
// It prevent program for Crashing
// After handling some error program again run with its pace
// It show user meaning full error message