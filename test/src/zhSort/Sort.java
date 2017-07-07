package zhSort;

import java.util.*;

public class Sort {
	public static void main(String[] args) {
		Set<Person> m=new TreeSet<Person>
		(new myCompare());
		m.add(new Person("b"));
		m.add(new Person("c"));
		m.add(new Person("a"));
		m.add(new Person("张三"));
		m.add(new Person("李四"));
		m.add(new Person("王五"));
		m.add(new Person("张啊"));
		for(Person p:m){
		System.out.println(p.name);}

//		 Comparator cmp = Collator.getInstance(java.util.Locale.CHINA);      
	}
}
