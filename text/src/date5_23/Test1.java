package date5_23;
import java.io.*;

public class Test1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream a=new FileOutputStream
		("D:/Java/worksapce/text/src/date5_23/copy1.txt");
		a.write("ads".getBytes());
		a.close();
		FileInputStream b=new FileInputStream
		("D:/Java/worksapce/text/src/date5_23/copy1.txt");	
		FileOutputStream l=new FileOutputStream
				("D:/Java/worksapce/text/src/date5_23/copy1.txt");
		int f=b.available();
		byte[] k=new byte[f];
		b.read(k);
		System.out.println(new String(k));
		l.write(k);
		byte[] d=new byte[1024];
		int c=0;
		while((c=b.read(d))!=-1){
			l.write(d, 0, c);
			System.out.println(new String(d,0,c));
		}
		
		
		
		
	}
}
