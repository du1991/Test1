package zhSort;

import java.text.Collator;
import java.util.*;

public class Sort {
	public static void main(String[] args) {
		Set<Person> m=new TreeSet<Person>(Collator.getInstance(java.util.Locale.CHINA));
		m.add(new Person("b"));
		m.add(new Person("c"));
		m.add(new Person("a"));
		m.add(new Person("张三"));
		m.add(new Person("李四"));
		m.add(new Person("王五"));
		m.add(new Person("张陈"));
		for(Person p:m){
		System.out.println(p.name);}

//		 Comparator cmp = Collator.getInstance(java.util.Locale.CHINA);      
	}
}
