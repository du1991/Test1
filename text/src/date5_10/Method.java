package date5_10;

public class Method {

	public static void Pk(A[] a,M[] m,A c,M d)
	{
		while(true)
		{
			if(c.hp>0&&d.hp>0)
			{
				int f=(int)(Math.random()*2);// 先手number
				if(f==0) //aotemn 被打
				{
					if(c.hp<23){
						System.out.println(d.name+"正在攻击"+c.name+","+c.name+"还有0点血！");
						c.hp=0;
						}
					else{
					c.hp-=23;//怪兽 攻击力23
					System.out.println(d.name+"正在攻击"+c.name+","+c.name+"还有"+c.hp+"点血！");
				}}
				else//怪兽被打
				{
					if(d.hp<28)
					{
						System.out.println(c.name+"正在攻击"+d.name+","+d.name+"还有0点血！");
					d.hp=0;
					
					}
					else{
					d.hp-=28;//aoteman 攻击力28
					System.out.println(c.name+"正在攻击"+d.name+","+d.name+"还有"+d.hp+"点血！");
				}}
			}
			else if(c.hp==0)      /** (壹)			if之后用什么？ if和else 的意义不同  **/
			{
				c.hp=0;
				System.out.println(c.name+"已阵亡。\n"+d.name+"取得胜利！ 剩余"+d.hp+"点生命！\n");
				if(d.hp==100){d.hp=-100;}
				break;
				
			}
			else 
			{	d.hp=0;
				System.out.println(d.name+"已阵亡。\n"+c.name+"取得胜利！ 剩余"+c.hp+"点生命！\n");
				if(c.hp==100){c.hp=-100;}
				break;
			}
		}
	}
	
	public static A FindA(A[] a)       /**  贰     返回两个类型**/
	{
		
		for(A k:a)
		{
			if(k.hp==-100)
			{
				k.hp=100;
				return k;
			}
			if(k.hp>0&&k.hp<100)
			{
				return k;
			}
		}	
			while(true){
			int p=(int)(Math.random()*5);
			if(a[p].hp==100)
			{
				return a[p];
			}
			}		
	}
	public static M FindM(M[] m)
	{
		for(M k:m)
		{
			if(k.hp==-100){
				k.hp=100;
				return k;
			}
			if(k.hp>0&&k.hp<100)
			{
				return k;
			}
		
		}	

		
			while(true){
			int p=(int)(Math.random()*5);
			if(m[p].hp==100)
			{
				return m[p];
			}
			}
		
		
	}
}
