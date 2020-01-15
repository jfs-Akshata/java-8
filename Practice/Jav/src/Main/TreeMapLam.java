package Main;

import java.util.TreeMap;

public class TreeMapLam {
 public static void main(String args []) {
	TreeMap<Integer, String> t = new TreeMap<Integer, String>((I1,I2)->I2.compareTo(I1));
	t.put(0, "ABC");
	t.put(23, "XYZ");
	t.put(780, "PQR");
	t.put(7, "Rohit");
	System.out.println(t);
}
}
