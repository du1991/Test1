package dtae5_05;
import java.util.Arrays;

public class Delete {
public static void main(String[] args) {
	int [] a = {1,1,1,1,1,1,1,1,1,1,7,7,7,8,8,8,8,9,9,9};
	duu(a);}
public static void duu(int [] a){
	for(int i=0;i<a.length -1;i++)
	{  int j=i+1;
		while(j<a.length )
		{if(a[i]==a[j])
			{if(a[i]==a[a.length -1]){
			a=Arrays.copyOf(a, a.length-1);
			continue;}
			else{
			int temp=a[a.length -1];
			a[a.length -1]=a[j];
			a[j]=temp;
			a=Arrays.copyOf(a, a.length-1);
			}}
			j++;
		}
	}
		System.out.print(Arrays.toString(a));
}}
