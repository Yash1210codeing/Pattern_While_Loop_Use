package Pattern_While_Loop_Use;
import java.util.*;
public class Multiple_Rows_Stars_Pattern_Print {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);       
        int n=sc.nextInt();           // Input From Users Any Number
        int row=1;
        int nst=n; 
        // Loop for every row
        while(row<=n) {
        // Observe First Row
        // Work on the first row Print the star
        // Work Print the stars 
        	int i=1;
        	// Print star Loop
        	while(i<=nst) {
        		System.out.print("*"+" ");
        		i=i+1;       	     	     		
        	}
        	// Next Row Preparations
        	// No any work next row   
        	// Go For the next row  
        	row=row+1;
        	// Row line change
    		System.out.println();
        }
	}

}
