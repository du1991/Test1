package dtae5_05;

import java.util.Arrays;

public class Bingji {
public static void main(String[] args) {
	int [] a={1,2,3,4,5};
	int [] b={9,5,2,1};
	int count=0;
	for(int i=0;i<a.length ;i++)
	{
		for(int j=0;j<b.length ;j++)
		{
			if(a[i]==b[j])
			{
				count++;
				break;
			}
		}
	}
	int [] n=new int [a.length +b.length -count];
	for(int i=0;i<a.length ;i++)
	{
		n[i]=a[i];
	}
	int d=a.length ;
	for(int i=0;i<b.length;i++)
	{
		boolean f=true;
		for(int j=0;j<n.length ;j++)
		{
			if(n[j]==b[i])
			{
				f=false;
			}
		}
		if(f==true)
		{
			n[d]=b[i];
			d++;
		}
	}
	System.out.println(Arrays.toString(n));
}
}
