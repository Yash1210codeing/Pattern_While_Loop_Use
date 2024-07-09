package Pattern_While_Loop_Use;
import java.util.*;
public class Multiple_Rows_Decrement_Stars_Pattern_Print {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();             // Input From Users Any Number
        int row=1;
        int nst=1;
        int nsp=n-1;
        // For Every Row Print Loop
        while(row<=n) {
        	// Observer & Work on the first work
            // Print the star and space
        	// Print Space      
        	int i=1;
        	// Print Space Loop
        	while(i<=nsp) {
        	System.out.print("  ");
        	i=i+1;
        	}
        	// Print the star
        	int j=1;
        	// Print the star Loop
        	while(j<=nst) {
        	System.out.print("* ");
        	j=j+1;
        	}
        	// Next Row Preparations
        	// One Space Decrement
        	// One star Increment
        	nsp=nsp-1;
        	nst=nst+1;     
        	// Go For the next Row
        	row=row+1;
        	// Row Line Change
        	System.out.println();
        }
	}

}
