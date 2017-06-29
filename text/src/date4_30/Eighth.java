package date4_30;

public class Eighth {
public static void main(String[] args)
{
	int [] a={1,2,3,4,5,6,7};
	int [] b={9,8,7,6,5,4,4,4};	
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			if(a[i]==b[j]){
				count++;
				break;
			}
		}
	}
	int [] c=new int[count];
	int d=0;
	for(int i=0;i<a.length ;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			if(a[i]==b[j])
			{
				c[d]=a[i];
				d++;
				break;
			}
		}
	}
	for(int w:c)
	{
		System.out.print(w);
	}
	
}
}
