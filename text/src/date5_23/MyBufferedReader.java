package date5_23;
import java.io.*;

public class MyBufferedReader {

	FileReader a;
	int Linenumber=0;
	
	public MyBufferedReader(FileReader a){this.a=a;}
	
	public String myReadLine() throws IOException{
		Linenumber++;
		StringBuffer c=new StringBuffer();
		int b=0;
		while((b=a.read())!=-1){
			if(b=='\r'||b=='\n'){return c.toString();}
			c.append((char)b);
		}
		if(c.length()!=0){
			return c.toString();
		}
		return null;
	}
	
	public void setLinenumber(int a){
		this.Linenumber=a;
	}
	
	public int getLinenumber(){return this.Linenumber;}
	
	public void myClose() throws IOException{
		a.close();
	}
}
