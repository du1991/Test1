package date5_22;
import java.util.*;

public class Test1 {
	public static void main(String[] args) {
		//����ת����
		int[] c = {1,2,3,4};
		List<int[]>  d= Arrays.asList(c);
		System.out.println(d);//��ַ[[I@1db9742]
		
		Integer[] b={1,2,3,4};
		List<Integer> a=Arrays.asList(b);
		System.out.println(a);//ֵ[1, 2, 3, 4]
		
		a.contains(2);
		//*a.add(3);
		//*java.lang.UnsupportedOperationException ��֧�ֲ����쳣
		//*ע�⣺������ת��Ϊ���ϣ�������ʹ�ü��ϵ���ɾ��������Ϊ����ĳ����ǹ̶���
		
		//����ת���飺
		ArrayList<String> list = new ArrayList<String>();
		list.add("a1");
		list.add("a2");
		list.add("a3");
		String[] arr=list.toArray(new String[0]);
		String[] arr1=list.toArray(new String[list.size()]);
		System.out.println(Arrays.toString(arr));
		//* ��ָ�����͵����鳤��С�ڼ��ϵ�size����ô�÷����ڲ��ᴴ��һ�����鳤��Ϊsize
		//* ��ָ�����͵����鳤�ȴ����˼��ϵ�size���Ͳ����´������飬����ʹ�ô��ݽ��������顣
		//* ���Դ���һ���ոպõ���������
		 
		
		
		
		
	}

	//*�ɱ������ʽ
	public static void duu(int a,int...c){System.out.println("s");}
	
}
