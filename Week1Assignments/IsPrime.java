package Week1Assignments;

public class IsPrime {
	public static void main(String[] args) {
		
		 int n=61;
		 boolean Isprime=false;
		 
		 for (int i = 2; i <= n/2 ; i++) {
			 
			 if(n%i == 0) {
				 
				 Isprime=true;
				 
				 break;
			 }
			 }
			 
			 if(!Isprime) {
				 System.out.println(n+" Is a prime number ");
			 }else {
				 System.out.println(n+" Is not a prime number");
				 
			}
		 }
			
		 
		}


