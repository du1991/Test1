package date5_21;

public class Person {

	String name;
	int age;
	
	public Person(String name,int age){this.age=age;this.name=name;}
	
	public int hashCode(){return 20;}
	
	public boolean equals(Object a){
		Person b=(Person)a;
		return this.age==b.age&&this.name.equals(b.name);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
