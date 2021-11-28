import java.util.Scanner;
public class HalfDiamondPatternPrintingUsingNumbers{

	private static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		System.out.println("Enter a limit");
		int N = sc.nextInt();
		System.out.println("Enter a number");
		int k = sc.nextInt();
		for(int i=1; i<=N; i++){
			for(int j=1; j<=i; j++){
				System.out.print(k);
			}
			System.out.println();
			k++;
		}
		k -= 2;
		for(int i=N-1; i>=1; i--){
			for(int j=i; j>=1; j--){
				System.out.print(k);
			}
			System.out.println();
			k--;
		}
	}
}



		/*----OUTPUT----
		Enter a number
		3
		3
		44
		555
		6666
		555
		44
		3	*/