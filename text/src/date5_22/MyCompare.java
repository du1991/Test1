package date5_22;
import java.util.Comparator;

public class MyCompare implements Comparator<String>{//泛型
	//注意一		泛型
	public int compare(String a,String b){//泛型
		if(a.length()>b.length()){
			return 1;}
		else if(a.length()==b.length()){
			return a.compareTo(b);
		}
		return -1;
	}
}
