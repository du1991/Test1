package dtae5_05;

import java.util.Scanner;

public class Dajinzita {
public static void main(String[] args)
{
	while(true){
	System.out.println("请输入行数");
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	for(int i=1;i<=a;i++)
	{
		
		//打印空格
		for(int j=a-i;j>=0;j--)
		{
			System.out.print(" ");
		}
		if(i==1){System.out.print("");}
		else if(i==a/2+a%2)
		{
			for(int k=1;k<=2*(a/2+a%2)-2;k++)
			{
				System.out.print("*");
			}
		}
		else{
		System.out.print("*");
		for(int l=1;l<=2*i-3;l++)
		{
			System.out.print(" ");
		}}
		System.out.println("*");
		
	}
}
}
}