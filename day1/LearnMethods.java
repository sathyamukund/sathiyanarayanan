package week1.day1;

public class LearnMethods {

	public static void main(String[] args) {
		LearnMethods obj = new LearnMethods();
		obj.printCarName();
		int carRegNumber = obj.getCarRegNumber();
		System.out.println(carRegNumber);
		String carVarient = obj.getCarVarient();
		System.out.println(carVarient);
		int multiply = obj.multiplyTwoNumber(2,3);
		System.out.println(multiply);	
	}
		// TODO Auto-generated method stub
         public void printCarName() {
        	 System.out.println("swift");
         }
         public int getCarRegNumber() {
              int carRegNumber= 2425;
              return carRegNumber;
         }
         public String getCarVarient(){
               return "diesel";
         }
         public int multiplyTwoNumber(int a,int b) {
        	   return a*b;
        	   }
         
         
	}


