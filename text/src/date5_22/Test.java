package date5_22;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		List<String> a=new ArrayList<String>();
		a.add("cdfg");
		a.add("acfgg");
		a.add("bdf");
		Collections.sort(a);
		Collections.sort(a,new MyCompare());
		Collections.sort(a,Collections.reverseOrder());
		Collections.sort(a,Collections.reverseOrder(new MyCompare()));
	}
}
