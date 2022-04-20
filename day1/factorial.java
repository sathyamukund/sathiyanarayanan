package week1.day1;

public class factorial {

	public static void main(String[] args) {
		//To find the factorial of given number
		int n = 5, fact = 1;
		for(int i = 5; i <= n; i++) {
			fact = fact * i;
		}
			System.out.println(fact);

	}

}
