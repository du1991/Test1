package date5_17;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


//集合取出方法---keySet
public class Text1 {
	public static void main(String[] args) {
		Map<Integer,Character> a=new TreeMap<Integer,Character>();
		//HashMap和TreeMap都可以
		a.put(1,'z');
		a.put(2, 'c');
		a.put(3, 's');
		
		Set<Integer> b=a.keySet();
		Iterator<Integer> c=b.iterator();
//		while(c.hasNext())
//		{
//			Integer key=c.next();
//			Character value=a.get(key);
//			System.out.println(key+""+value);
//			//字符串拼接，如果是两个参数，之间用+
////注意一：		//则表示相加，不能表示为(key+value) 
//		}
		//用StringBuffer
		StringBuffer s=new StringBuffer();
		while(c.hasNext())
		{
			Integer key=c.next();
			Character value=a.get(key);
			s.append("key="+key+","+"Value="+value+"\n");
//注意二： StringBuffer相当于开辟一个空间，存储后续内容，
//然后再 一起用SYSO打印出来
		}
		System.out.println(s);
	}


	
	
	
	
}
