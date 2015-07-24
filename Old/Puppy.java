public class Puppy{
	int puppyAge;	

	public Puppy(String name){
		System.out.println("Passed Name is: " + name);
	}
	
	public void setAge(int age){
		puppyAge = age;
	}

	public int getAge(){
		System.out.println("Puppy is " + puppyAge + " years old.");
		return puppyAge;
	}

	public static void main(String []args){
		Puppy myPuppy = new Puppy("Rex");

		myPuppy.setAge(2);
		myPuppy.getAge();
		System.out.println("Var value: " + myPuppy.puppyAge);
	} 
}
