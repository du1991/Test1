package date5_16;

public class Student {

	int age;
	String name;

	public Student(int age,String name){this.name=name;this.age=age;}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
	
	
}
