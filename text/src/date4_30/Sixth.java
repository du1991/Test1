package date4_30;

public class Sixth {
public static void main(String[] args){
	int []a={0,1,2,3,4,4,4,5,6,7,8,9,9};
	duu(a);	
}

public static void duu(int a[]){
int t=0;//计数重复的次数
	for(int i=0;i<a.length-1;i++)
	{
		for(int j=i+1;j<a.length;j++){
			if(a[i]==a[j]){
				t++;
				break;//必须跳出，不然三个重复就错了
			}		
}	}
	int [] b=new int[a.length-t];
	int d=0;//新数据的角标
	for(int i=0;i<a.length;i++){
		boolean f=true;
		for(int j=0;j<b.length;j++){
		if(b[j]==a[i]){
			f=false;
			break;
		}
	}
		if(f==true){
			b[d]=a[i];
			d++;}
}for(int k=0;k<d;k++){
	System.out.print(b[k]);
}
	}
}
