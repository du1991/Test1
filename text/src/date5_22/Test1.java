package date5_22;
import java.util.*;

public class Test1 {
	public static void main(String[] args) {
		//数组转集合
		int[] c = {1,2,3,4};
		List<int[]>  d= Arrays.asList(c);
		System.out.println(d);//地址[[I@1db9742]
		
		Integer[] b={1,2,3,4};
		List<Integer> a=Arrays.asList(b);
		System.out.println(a);//值[1, 2, 3, 4]
		
		a.contains(2);
		//*a.add(3);
		//*java.lang.UnsupportedOperationException 不支持操作异常
		//*注意：将数组转换为集合，不可以使用集合的增删方法，因为数组的长度是固定的
		
		//集合转数组：
		ArrayList<String> list = new ArrayList<String>();
		list.add("a1");
		list.add("a2");
		list.add("a3");
		String[] arr=list.toArray(new String[0]);
		String[] arr1=list.toArray(new String[list.size()]);
		System.out.println(Arrays.toString(arr));
		//* 当指定类型的数组长度小于集合的size，那么该方法内部会创建一个数组长度为size
		//* 当指定类型的数组长度大于了集合的size，就不会新创建数组，而是使用传递进来的数组。
		//* 所以创建一个刚刚好的数组最优
		 
		
		
		
		
	}

	//*可变参数格式
	public static void duu(int a,int...c){System.out.println("s");}
	
}
