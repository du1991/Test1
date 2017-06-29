package dtae5_05;
import java.io.*;

public class Tset {
	public static void main(String[] args) {
		//创建文件
		FileWriter b=null;
		try{
		//*方法一	
		b=new FileWriter("copy.txt");
		b.write("我是好人");
		//*方法二
		//*b=new FileWriter("D:/Java/worksapce/text/src/dtae5_05/copy.java")
		//*在指定位置创建文件
		//*方法三
		//*BufferedWriter c=new BufferedWriter(b);b.write("我是好人")
		//*方法四
		//*File a=new File("D:/Java/worksapce/text/src/dtae5_05/copy.java");
		//*a.creatNewFile();
		}
		catch(IOException e){
			System.out.println(e);
		}
		finally{
			try {
				b.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
