import java.util.Scanner;

public class CodeChallenfeTernaryOP {

	public static void main(String[] args) {
		int num=0;
		boolean result;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter a number");
		num= sc.nextInt();
		
		result = (num %2 == 0)? true:false;
		if(result == true) {
			System.out.println("even : "+num);
		}
		else {
			System.out.println("odd : "+num);
			
		}

	}

}
