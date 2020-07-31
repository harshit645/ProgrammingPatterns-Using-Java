package patternsusingforloop;
import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		
/*          *
 *          * *
 *          * * *
 *          * * * *
 *          * * *
 *          * *
 *          *      
 */
//		In this program the no. of rows is not equal to n so we make a formula for no. of rows
		int rows=2*n-1;
		
		for(int i=1;i<=rows;i++) {
			if(i<=n) {
//				this loop for increasing the stars
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
				
			}
				else {
//					this loop for decreasing the stars
					for(int j=1;j<=rows-i+1;j++) {
						System.out.print("* ");
					}
					
				}
//			for changing the line
			System.out.println();
		}
	}

}
