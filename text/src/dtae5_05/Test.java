package dtae5_05;
import java.io.*;

public class Test {
	public static void main(String[] args) {
		//读取文件
		FileReader b=null;
		BufferedReader a=null;
		try{
			//*方法一  BufferedReader
//			b=new FileReader("D:/Java/worksapce/text/src/dtae5_05/copy.java");
//			a=new BufferedReader(b);
//			String c=null;
//			while((c=a.readLine())!=null){
//				System.out.println(c);
//			}
			//*方法二 FileReader
			b=new FileReader("D:/Java/worksapce/text/src/dtae5_05/copy.java");
			char[] c=new char[2];
			int d=0;
			while((d=b.read(c))!=-1){
				System.out.println(c);
			}
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
