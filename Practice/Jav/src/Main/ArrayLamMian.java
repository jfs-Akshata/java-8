package Main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayLamMian {
 public static void main(String agrs[]) {
	ArrayList<Integer> l = new ArrayList<Integer>();
	l.add(10);
	l.add(15);
	l.add(26);
	l.add(1);
	l.add(5);
	l.add(06);
	System.out.println("Before Sorting "+l);
	 //Collections.sort(l,(I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
	 Collections.sort(l,(I1,I2)->I2.compareTo(I1));
		/* Collections.sort(l,I2.compareToI1); */
	 System.out.println("After sorting"+l);
}
}
