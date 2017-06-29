package date5_31;

import javax.swing.JOptionPane;


public class Test {
	public static void main(String[] args) {
		
		String a="......";
		String regex="[.]+";
		System.out.println(a.matches(regex));
		//[[a-z][A-Z][0-9]]{6,10}@([[a-z][A-Z] ]+|[0-9]+).com
		
	}
}

