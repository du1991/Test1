package Date5_26;
import java.io.*;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		File a=new File("ssss");
		System.out.println(a.list().length);
//		a.mkdirs();
//		delete("C:/Users/Adminstrator/Desktop/a");
		
	}
	public static void delete(String path){
		File a=new File(path);
		if(a.list().length!=0){
		String	newpath=path+"/"+a.list()[0];
		delete(newpath);}
		//或者for(String k:a.list()){
//		String newpath=path+"/"+k;
//		delete(newpath)}
		System.out.println(path+"删除成功");
		a.delete();
		}
	
}
