package dtae5_05;
import java.io.*;

public class Tset {
	public static void main(String[] args) {
		//�����ļ�
		FileWriter b=null;
		try{
		//*����һ	
		b=new FileWriter("copy.txt");
		b.write("���Ǻ���");
		//*������
		//*b=new FileWriter("D:/Java/worksapce/text/src/dtae5_05/copy.java")
		//*��ָ��λ�ô����ļ�
		//*������
		//*BufferedWriter c=new BufferedWriter(b);b.write("���Ǻ���")
		//*������
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
