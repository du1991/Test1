package date5_22;
import java.util.Comparator;

public class MyCompare implements Comparator<String>{//����
	//ע��һ		����
	public int compare(String a,String b){//����
		if(a.length()>b.length()){
			return 1;}
		else if(a.length()==b.length()){
			return a.compareTo(b);
		}
		return -1;
	}
}
