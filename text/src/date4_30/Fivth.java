package date4_30;

public class Fivth {
public static void main(String[] args){
	int []a={0,1,2,3,4,4,4,5,6,7,8,9,9};
	int []b=new int[10];
	int k=0;
	for(int i=0;i<a.length;i++)//原数组的角标   为什么不是a.length-1：
//		和后面的啊吧【k】=【i】有关系
	{	boolean s=true;  //有重复的就不赋值
		for(int j=i+1;j<a.length;j++){//原数组对比重复的值
			if(a[i]==a[j]){
				s=false;
				break;//必须跳出，不然三个重复就错了
			}				
           }	
		if(s==true){
		b[k]=a[i];
	k++;	}	
	}for(int d:b){
		System.out.print(d);
	}
	
	}}
