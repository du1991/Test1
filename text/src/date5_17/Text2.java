package date5_17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//entrySet
public class Text2 {
public static void main(String[] args) {
	Map<Student,String > a=new HashMap<Student,String>();
//	a.put(new Student(), "a");
//	a.put(new Student(), "b");
//	a.put(new Student(), "c");
	
// 注意一：	Set<Map.Entry<key,value>>
// 			Entry为Map的类中类，（接口中的接口）	
	Set<Map.Entry<Student, String>> b=a.entrySet();
	Iterator<Map.Entry<Student,String>> c=b.iterator();
//方法-：	
//	while(c.hasNext())
//	{
//		System.out.println(c.next());
//	}
//方法二：
//注意二：    c.next的内容的属性就是  Iterator<>泛型中的类型  
	while(c.hasNext())
	{
		Map.Entry<Student,String> k=c.next();
		Student key=k.getKey();
		String value=k.getValue();
		System.out.println(key+"  "+value);
//注意三： Map.Entry和Map最大的区别在于可以
//直接获取此项对应的key和value：getKey（），getValue（）
	}
}
}
