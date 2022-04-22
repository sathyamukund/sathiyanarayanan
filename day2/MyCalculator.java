package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		calculator calc=new calculator();
		int sum,diff,num1=125,num2=14,num3=100;
		double product;
		float Quotient;
		sum=calc.add(num1, num2, num3);
		System.out.println("Addition of "+num1+", "+num2+", "+ num3 +" is "+ sum +"\n");
		
		diff=calc.sub(num1, num2);
		System.out.println("Subtraction of "+num1+", "+num2+" is "+ diff+"\n");
		
		product=calc.mul(num1, num2);
		System.out.println("Multiplication of "+num1+", "+num2+" is "+ product+"\n");
		
		Quotient=calc.divide(125.0f, 14.0f);
		System.out.println("Division of "+num1+", "+num2 +" is "+ Quotient+"\n");
	}

}
