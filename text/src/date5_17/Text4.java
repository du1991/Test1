package date5_17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

//��HashMap����
public class Text4 {
public static void main(String[] args) {
	
	HashMap<Student,String> a=new HashMap<Student,String>();
	a.put(new Student("da",20), "�Ĵ�");
	a.put(new Student("ab",19), "�Ͻ�");
	a.put(new Student("bac",22), "ɽ��");
//ע��һ��HashMap ��������TreeMap��putʱ����
//���Դ˴�Ҫǿת
	Set<Student> b=a.keySet();
	TreeSet<Student> c=new TreeSet<Student>(b);//ע����� ͬ��Ҫ��дStudent���е�compareTO
//ע�� ��	�˴��൱��ǿת Set��ΪTreeSet��
//�������ã�TreeSet����ӦΪֻ��new �Ż��������򣡣���
//�൱��int a�� Integer b=(Integer)a    Integer b=new Integer(a)
//ǿת�����ַ�ʽ������������������	
	Iterator<Student> d=c.iterator();
	while(d.hasNext())
	{
		Student f=d.next();
		System.out.println(f+"  "+a.get(f));
	}
	//ע����   ��������entrySet����Ϊ�������ΪStudent�����ĵ�key��
//	Set<Map.Entry<Student, String>> b=a.entrySet();
//	TreeSet<Map.Entry<Student, String>> c=new TreeSet<Map.Entry<Student, String>>(b);
//	Iterator<Map.Entry<Student, String>> d=c.iterator();
//	while(d.hasNext()){System.out.println(d.next());}
}
}
