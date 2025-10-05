
public class Student {

	
	private String name;
	private int rollno;
	private String phone_no;
	private String address;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student studentObj=new Student();
		Student studentObj2=new Student();
		
		//setting values manually
		studentObj.name="John";
		studentObj.rollno=34;
		studentObj.phone_no="67323211232";
		studentObj.address="Pune";
		
		studentObj2.name="Sam";
		studentObj2.rollno=23;
		studentObj2.phone_no="67323211232";
		studentObj2.address="Latur";
		
		
		// print directly
		System.out.println("Student1: " + studentObj.name + " | " + studentObj.rollno + " | " + studentObj.phone_no+"|"+studentObj.address);
		System.out.println("Student2: " + studentObj2.name + " | " + studentObj2.rollno + " | " + studentObj2.phone_no+"|"+studentObj.address);
		
		
	}

}
