package date5_17;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


//����ȡ������---keySet
public class Text1 {
	public static void main(String[] args) {
		Map<Integer,Character> a=new TreeMap<Integer,Character>();
		//HashMap��TreeMap������
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
//			//�ַ���ƴ�ӣ����������������֮����+
////ע��һ��		//���ʾ��ӣ����ܱ�ʾΪ(key+value) 
//		}
		//��StringBuffer
		StringBuffer s=new StringBuffer();
		while(c.hasNext())
		{
			Integer key=c.next();
			Character value=a.get(key);
			s.append("key="+key+","+"Value="+value+"\n");
//ע����� StringBuffer�൱�ڿ���һ���ռ䣬�洢�������ݣ�
//Ȼ���� һ����SYSO��ӡ����
		}
		System.out.println(s);
	}


	
	
	
	
}
