package date5_16;

public class Person {
	String name;
	int age;
	
	Person(){}
	Person(String name){this.name=name;}
	Person(Person a){this.name=a.name;}
	Person(Worker a){this.name=a.name;}
}
