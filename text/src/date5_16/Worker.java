package date5_16;

public class Worker {
int age;
String name;

public Worker(int age,String name){this.name=name;this.age=age;}

@Override
public String toString() {
	return "Worker [age=" + age + ", name=" + name + "]";
}


}
