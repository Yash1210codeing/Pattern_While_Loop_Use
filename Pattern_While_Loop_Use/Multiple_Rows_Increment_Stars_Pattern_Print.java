package Pattern_While_Loop_Use;
import java.util.*;
public class Multiple_Rows_Increment_Stars_Pattern_Print {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();            // Input From Users Any Number
        int row=1;
        int star=1;
        // For Every Row Print Loop
        while(row<=n) {
        // Observer & Work on the first work
        // Print the star  
        int i=1;
        // Print Stars Loop
        while(i<=star) {
        	System.out.print("* ");
        	i++;
        }
        // Next Row Preparations
        // Increment one Star
        star=star+1;
        // Go For the next row
        row=row+1;
        // Row Line Change
        System.out.println();       
      }       
	}

}
