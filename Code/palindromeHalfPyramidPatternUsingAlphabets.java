import java.util.Scanner;
public class palindromeHalfPyramidPatternUsingAlphabets{

	private static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		System.out.println("Enter a Rou limit value");
		int N = sc.nextInt();

		for(int i=1; i<=N; i++){
			char ch = 'A';
			int range = 2*i-1;
			for(int j=1; j<=range; j++){
				if(j<=range/2){
					System.out.print(ch +" ");
					ch++;
				}
				else{
					System.out.print(ch +" ");
					ch--;
				}
				
			}
			System.out.println();
		}
	}
}



		/*----OUTPUT----
		Enter a Rou limit value
		5
		A
		A B A
		A B C B A
		A B C D C B A
		A B C D E D C B 	*/