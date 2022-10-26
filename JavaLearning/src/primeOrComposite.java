import java.util.Scanner;

public class primeOrComposite {

	public static void main(String[] args) {
		int num,i,flag=15;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number");
		num = sc.nextInt();
		
		for(i=2;i<num/2;i++) {
			flag=0;
			if(num%i == 0) {
				flag=1;
				break;
			}
		}
		
		switch(flag) {
		case 0:
			System.out.println("prime numeber"+num);
			break;
		case 1:
			System.out.println("composite numeber"+num);
			break;
		default:
			System.out.println("neither prime nor composite numeber"+num);
			break;
		}
		

	}

}
