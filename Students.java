package week3.day1;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("the student id is " + id);
		}
    public void getStudentInfo(String name, int id) {
    	System.out.println("student name is " + name);
    	System.out.println("student id is " + id);
    }
    public void getStudentInfo(String email,long phoneNumber) {
    	System.out.println("the email is " + email);
    	System.out.println("students phone number is " + phoneNumber);
    }

	public static void main(String[] args) {
		Students students = new Students();
    	students.getStudentInfo(220023043);
    	students.getStudentInfo("sathya", 220023043);
    	students.getStudentInfo("sathyamukund24@gmail.com", 7397509113L);
    	
    	

	}

}
