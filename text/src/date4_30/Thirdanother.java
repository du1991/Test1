package date4_30;
import java.util.Scanner;

public class Thirdanother {
	public static void main(String [] args){
		while(true){
		System.out.println("�������������֣�");
		Scanner s=new Scanner(System.in);
		String a=s.next();
		char []b=a.toCharArray();
		if(b.length>=12)
		{System.out.println("���������������Χ");}
		else{
		char []c={'0','1','2','3','4','5','6','7','8','9'};
		char []d={'��','һ','��','��','��','��','��','��','��','��'};
		String []f={" ","ʮ","��","ǧ","��","ʮ","��","ǧ","��","ʮ","��"};	
		for(int i=0;i<b.length;i++){
			for(int j=0;j<10;j++){
				if(b[i]==c[j]){
					System.out.print(d[j]);
				}	
			}		
			System.out.print(f[b.length-i-1]);
		}
		System.out.println();
		}		}
	}	

}