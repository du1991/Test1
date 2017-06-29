package dtae5_05;
import java.io.*;

public class Test2 {
	public static void main(String[] args) {
		//复制文件
		FileReader b=null;
		BufferedReader a=null;
		FileWriter f=null;
		try{
			//*方法一  BufferedReader
//			b=new FileReader("D:/Java/worksapce/text/src/dtae5_05/copy.java");
//			f=new FileWriter("copy.txt");
//			a=new BufferedReader(b);
//			String c=null;
//			while((c=a.readLine())!=null){
//				f.write(c+"\n");
//				System.out.println(c);
//			}f.close();
//			//*方法二 FileReader
			b=new FileReader("D:/Java/worksapce/text/src/dtae5_05/copy.java");
			f=new FileWriter("a.txt");
			char[] c=new char[2];
			int d=0;
			while((d=b.read(c))!=-1){
				f.write(c,0,d);
				System.out.println(new String(c));
			}f.close();
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
