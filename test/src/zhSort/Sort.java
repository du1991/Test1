package zhSort;

import java.text.Collator;
import java.util.*;

public class Sort {
	public static void main(String[] args) {
		Set<Person> m=new TreeSet<Person>(Collator.getInstance(java.util.Locale.CHINA));
		m.add(new Person("b"));
		m.add(new Person("c"));
		m.add(new Person("a"));
		m.add(new Person("����"));
		m.add(new Person("����"));
		m.add(new Person("����"));
		m.add(new Person("�ų�"));
		for(Person p:m){
		System.out.println(p.name);}

//		 Comparator cmp = Collator.getInstance(java.util.Locale.CHINA);      
	}
}
