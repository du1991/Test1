package date4_30;
import java.util.Scanner;

public class Third {
	public static void main(String [] args){
		while(true){
		System.out.println("�������������֣�");
		Scanner s=new Scanner(System.in);
		String a=s.next();
		char []b=a.toCharArray();
		if(b.length>=12){
			System.out.println("����������ֳ�����Χ");
		}
		else{
		char []c={'0','1','2','3','4','5','6','7','8','9'};
		char []d={'��','һ','��','��','��','��','��','��','��','��'};
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
		case 1:System.out.print("ʮ");break;
		case 2:System.out.print("��");break;
		case 3:System.out.print("ǧ");break;
		case 4:System.out.print("��");break;
		case 5:System.out.print("ʮ");break;
		case 6:System.out.print("��");break;
		case 7:System.out.print("ǧ");break;
		case 8:System.out.print("��");break;
		case 9:System.out.print("ʮ");break;
		case 10:System.out.print("��");break;
		}
	
	}
}
