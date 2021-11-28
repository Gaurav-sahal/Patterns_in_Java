import java.util.Scanner;
public class HollowInvertedHalfPyramidPatternUsingNumbers{

	private static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		System.out.println("Enter a Row limit");
		int N = sc.nextInt();
		int n = 1;
		for(int i=N; i>=1; i--){
			int k=n;
			for(int j=i; j>=1; j--){
				if(i==N || j==1 || j==i){
					System.out.print(k +" ");
				}
				else{
					System.out.print("  ");
				}
				k++;
			}
			n++;
			System.out.println();
		}
	}
}



		/*----OUTPUT----
		Enter a Row limit
		5
		1 2 3 4 5
		2     5
		3   5
		4 5
		5	*/