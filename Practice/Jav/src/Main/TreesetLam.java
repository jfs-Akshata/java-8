package Main;

import java.util.TreeSet;

public class TreesetLam {
public static void main(String agrs []) {
	TreeSet<Integer> t = new TreeSet<Integer>((I1, I2)->I2.compareTo(I1));
	t.add(199);
	t.add(45);
	t.add(0);
	t.add(2);
	t.add(51);
	
	System.out.println(t);
}
}
