package patternsusingforloop;
import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		
/*                  *
 *                * *
 *              *   *
 *            *     * 
 *          * * * * *    
 */
//		we divide this program into 3 parts
		
		for(int i=1;i<=n;i++) {
			
		
		for(int j=1;j<=n-i;j++) {
			System.out.print("  ");
		}
//		for first part
		if(i==1) {
			
			System.out.println("* ");
		}
//		for second part
		else if(i>1 && i<=n-1) {
			System.out.print("* ");
			
			for(int k=1;k<=i-2;k++) {
				System.out.print("  ");
				}
			System.out.print("* ");
//			for changing the line
			System.out.println();
		 }
//		for third part
		else {
		for(int k=1;k<=n;k++) {
			System.out.print("* ");
			}
		 }
		
	   }
      
	}

}
