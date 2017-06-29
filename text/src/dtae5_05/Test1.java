package dtae5_05;
import java.io.*;

public class Test1 {
	public static void main(String[] args) {
		//增加文件内容而不覆盖前面内容
		FileWriter b=null;
		BufferedWriter a=null;
		try{
		//方法一
		b=new FileWriter("D:/Java/worksapce/text/src/dtae5_05/copy.java",true);
		b.write("hello");
		//方法二
		BufferedWriter c=new BufferedWriter(b);
		c.write("好！！");
		c.flush();
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
