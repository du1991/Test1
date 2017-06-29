package date5_17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

//用HashMap来做
public class Text4 {
public static void main(String[] args) {
	
	HashMap<Student,String> a=new HashMap<Student,String>();
	a.put(new Student("da",20), "四川");
	a.put(new Student("ab",19), "南江");
	a.put(new Student("bac",22), "山西");
//注意一：HashMap 不能排序，TreeMap在put时排序；
//所以此处要强转
	Set<Student> b=a.keySet();
	TreeSet<Student> c=new TreeSet<Student>(b);//注意二： 同样要重写Student类中的compareTO
//注意 三	此处相当于强转 Set变为TreeSet，
//但不能用（TreeSet），应为只有new 才会重新排序！！！
//相当于int a： Integer b=(Integer)a    Integer b=new Integer(a)
//强转的两种方式：！！！！！！！！	
	Iterator<Student> d=c.iterator();
	while(d.hasNext())
	{
		Student f=d.next();
		System.out.println(f+"  "+a.get(f));
	}
	//注意四   不可以用entrySet，因为这里的类为Student，是拍的key建
//	Set<Map.Entry<Student, String>> b=a.entrySet();
//	TreeSet<Map.Entry<Student, String>> c=new TreeSet<Map.Entry<Student, String>>(b);
//	Iterator<Map.Entry<Student, String>> d=c.iterator();
//	while(d.hasNext()){System.out.println(d.next());}
}
}
