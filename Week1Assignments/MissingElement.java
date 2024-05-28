package Week1Assignments;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,4,3,2,8,6,7}; 
		Arrays.sort(a);
		int sum1=0,sum2=0;
		for (int i = 0; i < a.length; i++) {
		sum1=sum1+a[i];
		}
		//System.out.println(sum1);
	    for (int j = 1; j <= 8 ; j++) {
		sum2=sum2+j;
	    }
	   // System.out.println(sum2);
	    
	    int missingnum =sum2-sum1;
	    
	    System.out.println("The missing number is : "+missingnum);
	    }
        }
