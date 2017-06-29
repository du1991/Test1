package date4_30;
import java.util.Scanner;

public class Third {
	public static void main(String [] args){
		while(true){
		System.out.println("请输入您的数字：");
		Scanner s=new Scanner(System.in);
		String a=s.next();
		char []b=a.toCharArray();
		if(b.length>=12){
			System.out.println("您输入的数字超出范围");
		}
		else{
		char []c={'0','1','2','3','4','5','6','7','8','9'};
		char []d={'零','一','二','三','四','五','六','七','八','九'};
		for(int i=0;i<b.length;i++){
			for(int j=0;j<10;j++){
				if(b[i]==c[j]){
					System.out.print(d[j]);
				}					
			}	duu(b.length-i-1);		
		}
		System.out.println();
		}	}	
	}	
	public static void duu(int a){
		switch(a){
		case 0:System.out.print(" ");break;
		case 1:System.out.print("十");break;
		case 2:System.out.print("百");break;
		case 3:System.out.print("千");break;
		case 4:System.out.print("万");break;
		case 5:System.out.print("十");break;
		case 6:System.out.print("百");break;
		case 7:System.out.print("千");break;
		case 8:System.out.print("亿");break;
		case 9:System.out.print("十");break;
		case 10:System.out.print("百");break;
		}
	
	}
}
