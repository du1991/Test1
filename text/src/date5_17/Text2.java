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
	
// ע��һ��	Set<Map.Entry<key,value>>
// 			EntryΪMap�������࣬���ӿ��еĽӿڣ�	
	Set<Map.Entry<Student, String>> b=a.entrySet();
	Iterator<Map.Entry<Student,String>> c=b.iterator();
//����-��	
//	while(c.hasNext())
//	{
//		System.out.println(c.next());
//	}
//��������
//ע�����    c.next�����ݵ����Ծ���  Iterator<>�����е�����  
	while(c.hasNext())
	{
		Map.Entry<Student,String> k=c.next();
		Student key=k.getKey();
		String value=k.getValue();
		System.out.println(key+"  "+value);
//ע������ Map.Entry��Map�����������ڿ���
//ֱ�ӻ�ȡ�����Ӧ��key��value��getKey������getValue����
	}
}
}
