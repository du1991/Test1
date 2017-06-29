package Date5_26;
import java.io.*;

public class Test1 {
	public static void main(String[] args) {
		duu("C:/Users/Adminstrator/Desktop/a",1);
	}
	
	public static void duu(String path,int a){
		File b=new File(path);
		if(b.isDirectory()){
		for (int i = 0; i < a; i++) {
            System.out.print("=");
        }
		System.out.println(b.getName());
		String[] s=b.list();
		a++;
		for (int i = 0; i < s.length; i++) {
            String name = s[i];
            File e = new File(path, name);
            duu(e.getPath(), a);
        }}
		else{
            for (int i = 0; i < a; i++) {
                System.out.print("-");
            }
            System.out.println(b.getName());            
        }
		
	}
	
	
	
}
