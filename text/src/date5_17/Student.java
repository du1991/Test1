package date5_17;

//注意零			类impelments Comparable
//              要实现其中的compareTo()方法
public class Student implements Comparable{
String name;
Integer age;

public Student(String name, Integer age) {
	this.name = name;
	this.age = age;
}

//注意一		compareTo 默认只能比较String，Character，Integer等包装类，
//不能直接比较int char等
public int compareTo(Object obj)
{
	
	Student a=(Student) obj;
	if(this.name==a.name)
	{
		//先比较名字 		重写方法-
//if(this.age>a.age){return 1;}        
//else if(this.age==a.age){return 0;}  
//return -1;		
		//注意，另一种方法：重写方法二：只用一句话
//		return ((Integer)(this.age)).compareTo((Integer)(a.age));
		//注意，另一种方法：重写方法三：只用一句话
//		return new Integer(this.age).compareTo((Integer)(a.age));
		//注意，另一种方法：重写方法四：只用一句话
//		return new Integer(this.age).compareTo(new Integer(a.age));
//注意，重写方法五：   把属性int age改为 Integer
		return this.age.compareTo(a.age);
	}
	return this.name.compareTo(a.name);	
}

@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + "]";
}



}
