package date5_17;

import java.util.Scanner;
import java.util.TreeMap;

public class Jichong {
public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	String b=a.next();
	char[] c=b.toCharArray();
	TreeMap<Character,Integer> d=new TreeMap<Character,Integer>();
	for(int i=0;i<c.length;i++)
	{//方法1
//		Integer value=d.get(c[i]);
//		if(value==null){d.put(c[i], 1);}
//		else{d.put(c[i], ++value);}
		//方法2
		if(!d.containsKey(c[i])){d.put(c[i], 1);}
		else{Integer value=d.get(c[i]);
		d.put(c[i], ++value);}
		
	}
	System.out.println(d);
	
}
}
