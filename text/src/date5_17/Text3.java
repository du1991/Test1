package date5_17;

import java.util.TreeMap;

//TreeMap����
//ע��һ��TreeMap��put��ʱ��� �Լ������Լ�Ĭ�ϵ�
//compareTo����������������ֻ��Ҫ��дcompareTo����
//��  TreeSet����
public class Text3 {

	public static void main(String[] args) {
		TreeMap<Student,String> a=new TreeMap<Student,String>();
		a.put(new Student("da",20), "�Ĵ�");
		a.put(new Student("ab",19), "�Ͻ�");
		a.put(new Student("bac",22), "ɽ��");
		System.out.println(a);
		
	}
	
}
