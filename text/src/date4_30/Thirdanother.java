package date4_30;
import java.util.Scanner;

public class Thirdanother {
	public static void main(String [] args){
		while(true){
		System.out.println("请输入您的数字：");
		Scanner s=new Scanner(System.in);
		String a=s.next();
		char []b=a.toCharArray();
		if(b.length>=12)
		{System.out.println("您输入的数超出范围");}
		else{
		char []c={'0','1','2','3','4','5','6','7','8','9'};
		char []d={'零','一','二','三','四','五','六','七','八','九'};
		String []f={" ","十","百","千","万","十","百","千","亿","十","百"};	
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
