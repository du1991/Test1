package date4_30;

public class Sventh {
public static void main(String[] args){
	int [] a={1,2,3,4,5,6};
	int [] b={9,8,7,6,5,4};
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			if(a[i]==b[j]){
				count++;
			}
		}
	}
	int [] c=new int[a.length +b.length-count];
	for(int i=0;i<a.length ;i++)
	{
		c[i]=a[i];
	}
	int d=a.length ;
	for(int j=0;j<b.length  ;j++){//bสýื้	
		boolean f=true;
	for(int i=0;i<c.length ;i++)
	{
		if(c[i]==b[j])
		{
			f=false;
			break;
		}
		
	}

	if(f==true)
	{
		c[d]=b[j];
		d++;
	}
			}
	for(int k:c){
		System.out.print(k);
	}

	}
}
