package Pattern_While_Loop_Use;
import java.util.*;
public class Single_Row_Stars_Pattern_Print {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int nst=sc.nextInt();     // Input From Users Any Number
        int i=1;
        // Print Stars Loop Of User Input 
        while(i<=nst) {
        	System.out.print("*"+" ");
        	i=i+1;
        }
	}

}
