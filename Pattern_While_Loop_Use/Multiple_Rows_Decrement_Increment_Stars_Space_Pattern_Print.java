package Pattern_While_Loop_Use;
import java.util.*;
public class Multiple_Rows_Decrement_Increment_Stars_Space_Pattern_Print {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();              // Input From Users Any Number
        int row=1;
        int star=n;
        int nsp=0;
        // Every Row Print Loop
        while(row<=n) {
        	// Observer First Row & Work on the first row        	
        	//Print Space & Stars
        	// Print Space
        	int i=1;
        	// Space Print Loop
        	while(i<=nsp) {
        	System.out.print("  ");
        	i=i+1;
        	}
        	// Print the Star
        	int j=1;
        	// Stars Print Loop
        	while(j<=star) {
        	System.out.print("* ");
        	j=j+1;
        	}
        	// Next row pre
        	// Space Two Increment
        	// Star One Decrement
        	nsp+=2; // Space=Space+2;
        	star--;
        	// Go For the next Row
        	row++;
        	// Row Line Change
        	System.out.println();
        }
	}

}
