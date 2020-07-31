package patternsusingforloop;
import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		
/*                 *
 *              *     *
 *           *     *     *
 *        *     *     *     *
 */
		for(int i=1;i<=n;i++) {
//			this loop for outer spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
//			this loop for printing star and space with them
			for(int j=1;j<=i;j++) {
				System.out.print("*  ");
			}
//			for changing the line
			System.out.println();
		}

	}

}
