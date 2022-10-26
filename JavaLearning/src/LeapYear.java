
public class LeapYear {

	public static void main(String[] args) {
		int year=65;

		if(year % 400 ==0) {
			System.out.println("Leap Year :"+ year);
		}
		else if((year%4==0) && (year%100 !=0))
		{
			System.out.println("Leap Year :"+ year);
		}
		else {
			System.out.println("not a Leap Year :"+ year);
		}
	}

}
