package date5_17;

//ע����			��impelments Comparable
//              Ҫʵ�����е�compareTo()����
public class Student implements Comparable{
String name;
Integer age;

public Student(String name, Integer age) {
	this.name = name;
	this.age = age;
}

//ע��һ		compareTo Ĭ��ֻ�ܱȽ�String��Character��Integer�Ȱ�װ�࣬
//����ֱ�ӱȽ�int char��
public int compareTo(Object obj)
{
	
	Student a=(Student) obj;
	if(this.name==a.name)
	{
		//�ȱȽ����� 		��д����-
//if(this.age>a.age){return 1;}        
//else if(this.age==a.age){return 0;}  
//return -1;		
		//ע�⣬��һ�ַ�������д��������ֻ��һ�仰
//		return ((Integer)(this.age)).compareTo((Integer)(a.age));
		//ע�⣬��һ�ַ�������д��������ֻ��һ�仰
//		return new Integer(this.age).compareTo((Integer)(a.age));
		//ע�⣬��һ�ַ�������д�����ģ�ֻ��һ�仰
//		return new Integer(this.age).compareTo(new Integer(a.age));
//ע�⣬��д�����壺   ������int age��Ϊ Integer
		return this.age.compareTo(a.age);
	}
	return this.name.compareTo(a.name);	
}

@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + "]";
}



}
