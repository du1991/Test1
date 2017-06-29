package date4_30;

public class Forth {
public static void main(String[] args){
	int [] a=new int[10];
	int sum=0;
	for(int i=0;i<10;i++){
		a[i]=(int)(Math.random()*100);
		System.out.print(a[i]+",");
		sum+=a[i];
	}
	
	System.out.println("这些数字的总和为："+sum);
}
}
