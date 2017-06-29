package date5_16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {

	public static  void  main(String [] args) {
		
		ArrayList<Student> a=new ArrayList<Student>();
		a.add(new Student(1, "a"));
		ArrayList<Worker> b=new ArrayList<Worker>();
		b.add(new Worker(2,"b"));
		print1(a);
		print1(b);
		System.out.println();
		print(a);
		print(b);
	}
	public static <T> void print1(T a){
		Iterator b=((Collection)a).iterator();
		while(b.hasNext()){System.out.println(b.next());}
	}
	public static <T> void print(ArrayList<T> a){
		Iterator<T> b=a.iterator();
		while(b.hasNext()){System.out.println(b.next());}
	}
	
	
}
