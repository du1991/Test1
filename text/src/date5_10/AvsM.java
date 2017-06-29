package date5_10;

public class AvsM {
	public static void main(String[] args) {
		A [] a = {	new A("奥特曼1"),
					new A("奥特曼2"),
					new A("奥特曼3"),
					new A("奥特曼4"),
					new A("奥特曼5")};
		M [] m ={
					new M("小怪兽1"),
					new M("小怪兽2"),
					new M("小怪兽3"),
					new M("小怪兽4"),
					new M("小怪兽5")};	
		A c=a[(int)(Math.random()*a.length)];//A 特曼随机 “奥特曼”
															/** 叁      传入的参数以整体的 对象为单位！！！！而不是脚标！！！！！！这样更方便 **/
		M d=m[(int)(Math.random()*m.length)];//M 怪兽随机 “怪兽”
		Method.Pk(a, m, c, d);//
		while(true){
		int sumA=0;
		for(int i=0;i<5;i++)
		{
			sumA+=a[i].hp;
		}
		int sumM=0;
		for(int i=0;i<5;i++)
		{
			sumM+=m[i].hp;
		}	
		if(sumA==0||sumM==0)
		{
			if(sumA==0){
			System.out.println("小怪兽获得胜利！游戏结束！");
			System.exit(0);}
			else
			{
				System.out.println("奥特曼获得胜利！游戏结束！");
				System.exit(0);
			}
		}
		else
		{
		
			Method.Pk(a,m,Method.FindA(a),Method.FindM(m));	
		}
		}
		
	}

}
