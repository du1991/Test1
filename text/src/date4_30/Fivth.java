package date4_30;

public class Fivth {
public static void main(String[] args){
	int []a={0,1,2,3,4,4,4,5,6,7,8,9,9};
	int []b=new int[10];
	int k=0;
	for(int i=0;i<a.length;i++)//ԭ����ĽǱ�   Ϊʲô����a.length-1��
//		�ͺ���İ��ɡ�k��=��i���й�ϵ
	{	boolean s=true;  //���ظ��ľͲ���ֵ
		for(int j=i+1;j<a.length;j++){//ԭ����Ա��ظ���ֵ
			if(a[i]==a[j]){
				s=false;
				break;//������������Ȼ�����ظ��ʹ���
			}				
           }	
		if(s==true){
		b[k]=a[i];
	k++;	}	
	}for(int d:b){
		System.out.print(d);
	}
	
	}}
