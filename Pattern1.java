package patternsusingforloop;
import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		
/*   # # # #
 *   # # # #
 *   # # # #
 *   # # # #
 */
		 
		//generally we use i for rows and j for columns
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("# ");				
			}
//			for changing the line
			System.out.println();
		}

	}

}
