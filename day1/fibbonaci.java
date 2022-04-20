package week1.day1;

public class fibbonaci {

	public static void main(String[] args) {
		int r=8, firstNum = 0, secondNum = 1, sum;
		for(int i=1; i<=r; i++){
			System.out.println(firstNum);
			sum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = sum;
			
		}

	}

}
