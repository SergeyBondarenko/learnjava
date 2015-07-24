public class EmployeeRun{

	public static void main(String []argc){
		Employee aPerson = new Employee("Sergey Bondarenko", "Software Engineer");
		
		aPerson.setAge(30);
		aPerson.setSalary(3000);

		aPerson.printInfo();
	}
}
