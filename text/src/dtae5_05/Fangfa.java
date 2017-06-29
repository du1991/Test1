package dtae5_05;

public class Fangfa {
	public static int [] delete(int [] a){

	int count=0;
	for(int i=0;i<a.length-1;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				count++;
				break;
			}
		}
	}
	int [] b=new int[a.length-count];
	int d=0;
	for(int i=0;i<a.length;i++)
	{boolean f=true;
		for(int j=0;j<b.length;j++)
		{
			if(a[i]==b[j])
			{
				f=false;
				break;
			}
		
		
		}	if(f==true){
			b[d]=a[i];
			d++;
		}
	}
//	System.out.println(Arrays.toString(b));
//	for(int k:b)
//	{
//		System.out.print(k);
//	}
//	for(int i=0;i<b.length;i++)
//	{
//		System.out.print(b[i]);
//	}
	return b;
}}