package dtae5_05;
import java.io.*;

public class Test1 {
	public static void main(String[] args) {
		//�����ļ����ݶ�������ǰ������
		FileWriter b=null;
		BufferedWriter a=null;
		try{
		//����һ
		b=new FileWriter("D:/Java/worksapce/text/src/dtae5_05/copy.java",true);
		b.write("hello");
		//������
		BufferedWriter c=new BufferedWriter(b);
		c.write("�ã���");
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
