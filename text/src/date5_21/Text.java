package date5_21;

import java.util.*;

public class Text {

	public static void main(String[] args) {
		HashSet<Person> a=new HashSet<Person>();
		a.add(new Person("����",10));
		a.add(new Person("����",11));
		a.add(new Person("����",9));		
		a.add(new Person("����",10));		
		System.out.println(a);	
	}
}
