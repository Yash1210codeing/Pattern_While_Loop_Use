package Pattern_While_Loop_Use;
import java.util.*;
public class Multiple_Rows_Decrement_Increment_Stars_Space_Exclamation_sign_Pattern_Print_ {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();           // Input From Users Any Number
	        int row=1;
	        int nst=1;
	        int nsp=n-1;
	        // Every Row Print Loop
	        while(row<=n) {
	        	// Observer First Row & Work on the first row        	
	        	//Print Space & Stars & Exclamation Sign
	        	// Print Space	        
	        	int i=1;
	        	// Print Space Loop
	        	while(i<=nsp) {
	        	System.out.print("  ");
	        	i=i+1;
	        	}
	        	// Print Star
	        	int j=1;
	        	// Star Print Loop
	        	while(j<=nst) {
	        		// Exclamation Sign & Stars Print Conditions
	        		if(j%2!=0) {
	        			System.out.print("* ");
	        		}else {
	        			System.out.print("! ");
	        		}
	        		j=j+1;
	        	}
	        	// Next Row Preparations
	        	// Star Two Increment
	        	// Space One Decrement
	        	nst=nst+2;  // nst+=2;
	        	nsp--;
	        	// Go for the Next Row
	        	row=row+1;
	        	// Row Line Change
	        	System.out.println();	        	
	        }
	}

}
