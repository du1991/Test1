package date5_17;

import java.util.TreeMap;

//TreeMap做：
//注意一：TreeMap在put的时候会 自己根据自己默认的
//compareTo方法进行排序，所以只需要重写compareTo即可
//和  TreeSet类似
public class Text3 {

	public static void main(String[] args) {
		TreeMap<Student,String> a=new TreeMap<Student,String>();
		a.put(new Student("da",20), "四川");
		a.put(new Student("ab",19), "南江");
		a.put(new Student("bac",22), "山西");
		System.out.println(a);
		
	}
	
}
