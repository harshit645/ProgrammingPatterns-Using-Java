package patternsusingforloop;
import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();

/*         * * * * *
 *           * * * *
 *             * * *
 *               * *
 *                 *
 */
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i-1;j++) {
				System.out.print("  ");
			}
/*			u can use another variable but i can also use j here ,b'coz the scope
 *            of j in second loop is end                         
 */
	      for(int j=1;j<=n-i+1;j++) {
	    	  System.out.print("* ");
	      }
//	      for changing the line
	      System.out.println();
		}
		
	}

}
