package patternsusingforloop;
import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		
/*                 1
 *              2     3
 *           4     5     6
 *        7     8     9     10
 */
		
		int number=1;
		
		for(int i=1;i<=n;i++) {
//			this loop for printing spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
//			this loop for printing numbers and space with them
			for(int j=1;j<=i;j++) {
//				System.out.println(number++ +" ");
//				if you don't understand the upper equation then you have use also
				System.out.print(number+"  ");
				number++;
		
			}
//			for changing the line
			System.out.println();
		}

	}

}
