package Week1Assignments;

public class Palinfrome {
	
	public static void main(String[] args) {
		
	
	        int a = 121;
	        if (isPalindrome(a)) {
	            System.out.println(a + " is a palindrome.");
	        } else {
	            System.out.println(a + " is not a palindrome.");
	        }
	    }
	    public static boolean isPalindrome(int a) {
	        int originalNumber = a;
	        int reversedNumber = 0;
	        for (int i = a; i > 0; i /= 10) {
	            int rem = i % 10;
	            reversedNumber = reversedNumber * 10 + rem;
	        }
	        return originalNumber == reversedNumber;
		
	}
	

}
