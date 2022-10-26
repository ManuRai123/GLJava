import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number a: ");
		a= sc.nextInt();
		System.out.println("enter number b: ");
		b= sc.nextInt();

		

		while(true) {
			System.out.println("Enter option 1:Add 2: Sub 3: mul 4:div");
			c =sc.nextInt();
			switch(c){
			case 1:
				System.out.println("Addtion a+b=: "+(a+b));
				break;
			case 2:
				System.out.println("Subtract a-b=: "+(a-b));
				break;
			case 3:
				System.out.println("Multiply a*b=: "+(a*b));
				break;
			case 4:
				System.out.println("Divide a/b=: "+(a/b));
				break;

			default:
				break;
			}
		}

	}

}
