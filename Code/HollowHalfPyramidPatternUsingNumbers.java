import java.util.Scanner;
public class HollowHalfPyramidPatternUsingNumbers{

	private static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		System.out.println("Enter a Row limit value");
		int N = sc.nextInt();

		for(int i=1; i<=N; i++){
			int k=1;
			for(int j=1; j<=i; j++){
				if(j==1 || j==i || i==N){
					System.out.print(k +" ");
				}
				else{
					System.out.print("  ");
				}
				k++;
			}
			System.out.println();
		}
	}
}



		/*----OUTPUT----
		Enter a Row limit value
		5
		1
		1 2
		1   3
		1     4
		1 2 3 4 5	*/