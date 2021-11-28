import java.util.Scanner;
public class HalfDiamondPatternUsingNumbersAndStars{

	private static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		System.out.println("Enter a limit value");
		int N = sc.nextInt();
		int k=1;

		StringBuilder[] sb = new StringBuilder[N];
		for(int i=0; i<sb.length; i++){
			sb[i] = new StringBuilder("");
		}

		for(int i=1; i<=N; i++){
			for(int j=1; j<=2*i-1; j++){
				if(j%2==0){
					sb[i-1].append("*");
					System.out.print("*");
				}
				else{
					sb[i-1].append(k);
					System.out.print(k);
					k++;
				}
			}
			System.out.println();
		}

		for(int i=N-1; i>=0; i--){
			System.out.println(sb[i]);
		}
	}
}



			/*----OUTPUT----
			Enter a limit value
			4
			1
			2*3
			4*5*6
			7*8*9*10
			7*8*9*10
			4*5*6
			2*3
			1	*/