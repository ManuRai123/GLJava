import java.util.Scanner;

public class IfElseOp {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the number");
		num = sc.nextInt();
		if(num %2 ==0) {
			System.out.println("even number");
		}
		else
		{
			System.out.println("odd number");
		}
	}

}
