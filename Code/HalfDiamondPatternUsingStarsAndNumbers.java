import java.util.Scanner;
public class HalfDiamondPatternUsingStarsAndNumbers{

	private static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		System.out.println("Enter a limit value");
		int N = sc.nextInt();

		for(int i=1; i<=N; i++){
			int k=1,range=2*i-1;
			for(int j=1; j<=range; j++){
				if(j==1 || j==range){
					System.out.print("*");
				}
				else{
					if(j<=range/2){
						System.out.print(k);
						k++;
					}
					else{
						System.out.print(k);
						k--;
					}
				}
			}
			System.out.println();
		}

		for(int i=N-1; i>=1; i--){
			int k=1,range=2*i-1;
			for(int j=1; j<=range; j++){
				if(j==1 || j==range){
					System.out.print("*");
				}
				else{
					if(j<=range/2){
						System.out.print(k);
						k++;
					}
					else{
						System.out.print(k);
						k--;
					}
				}
			}
			System.out.println();
		}
	}
}



		/*----OUTPUT----
		Enter a limit value
		5
		*
		*1*
		*121*
		*12321*
		*1234321*
		*12321*
		*121*
		*1*
		*	*/