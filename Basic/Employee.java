public class Employee{
	String name, position;
	int age;
	double salary;
	
	public Employee(String n, String p){
		name = n;
		position = p;
	}

	public void setAge(int a){
		age = a;
	}

	public void setSalary(double s){
		salary = s;
	}

	public void printInfo(){
		System.out.println("Name: " + name);
		System.out.println("Position: " + position);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
	}

}
