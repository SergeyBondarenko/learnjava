public class Puppy{
	
	int puppyAge;

	public Puppy(String name){
		System.out.println("Dog's name is " + name);
	}

	public void setAge(int age){
		puppyAge = age;
	}

	public int getAge(){
		return puppyAge;
	}

	public static void main(String []argc){
		Puppy p = new Puppy("Bob");

		p.setAge(2);
		
		System.out.println("Puppy is " + p.getAge() + " years old!");
	}
}
