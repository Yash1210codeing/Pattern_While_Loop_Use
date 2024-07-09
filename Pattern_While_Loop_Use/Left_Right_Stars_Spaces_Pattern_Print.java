package Pattern_While_Loop_Use;
import  java.util.*;
public class Left_Right_Stars_Spaces_Pattern_Print {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();         // Input From Users Any Number
        int row=1;
        int nst=1;
        int nsp=2*n-3;
        // Every Row Print Loop
        while(row<=n) {
        	// Observer First Row & Work on the first row        	
        	//Print Left Star & Right Star & Space
        	// Print Left Star	                	
        	int i=1;
        	// Left Star Print Loop
        	while(i<=nst) {
        		System.out.print("* ");
        		i=i+1;
        	}
        	// Print Space
        	int j=1;
        	// Space Print Loop
        	while(j<=nsp) {
        		System.out.print("  ");
        		j=j+1;
        	}
        	// Right Star Print
        	int k=1;
        	// Left Star Print in Last Row Condition
        	if(row==n) {
        		k=2;
        	}
        	// Right Star Print Loop
        	while(k<=nst) {
        		System.out.print("* ");
        		k++;
        	}
        	// Next Row Preparations
        	// Space two Decrement
        	//Star One Increment
        	nsp=nsp-2;
        	nst++;
        	// Go for the next row
        	row++;
        	// Row Line Change
        	System.out.println();      	
        }
	}

}
