import java.util.Scanner;
public class HalfDiamondUsingNumbersAndStars{

	private static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		System.out.println("Enter a limit value");
		int N = sc.nextInt();
		int k=1;
		for(int i=1; i<=N; i++){
			for(int j=1; j<=2*i-1; j++){
				if(j%2==0){
					System.out.print("*");
				}
				else{
					System.out.print(k);
				}
			}
			k++;
			System.out.println();
		}
		k--;
		for(int i=N; i>=1; i--){
			for(int j=2*i-1; j>=1; j--){
				if(j%2==0){
					System.out.print("*");
				}
				else{
					System.out.print(k);
				}
			}
			k--;
			System.out.println();
		}

	}
}



		/*----OUTPUT----
		Enter a limit value
		4
		1
		2*2
		3*3*3
		4*4*4*4
		4*4*4*4
		3*3*3
		2*2
		1	*/