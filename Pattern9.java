package patternsusingforloop;
import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		
/*          *
 *          * *
 *          *   *
 *          *     *
 *          * * * * *    
 */
//		we divide this program into 3 parts
		
//		first part
		System.out.println("* ");
		
//		second part
//		we use i=2 b'coz first value we have already given and same reason for n-1
		for(int i=2;i<=n-1;i++) {
//			for starting star
			System.out.print("* ");

//			for i-2 spaces
			for(int j=1;j<=i-2;j++) {
				
//				we give one extra space for balance the gap
				System.out.print("  ");
			}
//			for ending star
			System.out.print("* ");
//			for changing the line
			System.out.println();
		}
		
//		third part
		if(n>1) {
			
		for(int i=1;i<=n;i++) {
			System.out.print("* ");
		}
		
	 }
		
	}

}
