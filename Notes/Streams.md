# Differnce Between java.io.Streams VS java.util.Streams

java.io.Streams     -->> file I/O operation
java.util.Streams   -->> To process Collectionm object (1.8 java version)

### Collection Vs Streams
Collection -->> Group of object as single entity then use collection
Streams    -->> Process an objects from from collection.

#### Used of stream concept
 **Fliter Program**
```
package demo.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExFliter {
 static void withoutStream(ArrayList<Integer> al) {
	 ArrayList<Integer> al1 = new ArrayList<Integer>();
	 for (Integer i: al) {
		 if(i%2==0) {
			 al1.add(i);
		 }
	 }
		System.out.println("WithOut streams  "+al1);
		
	}
 
 static void withStreamFilter(ArrayList<Integer> al) {
	 List<Integer> al1 = al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("With streams  "+al1);
		
	}
 
 static void withoutStreamMap(ArrayList<Integer> al) {
	 ArrayList<Integer> al1 = new ArrayList<Integer>();
	 for (Integer i: al) {
			 al1.add(i*2);
	 }
		System.out.println("WithOut streams  "+al1);
		
	}
 
 static void withStreamMap(ArrayList<Integer> al) {
	 List<Integer> al1 = al.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println("With streams  "+al1);
		
	}
	
	public static void main(String args[]) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(13);
		al.add(76);
		al.add(30);
		al.add(12);
		al.add(89);
		al.add(20);
		System.out.println("Original streams  "+al);
		//StreamExFliter.withoutStream(al);
		//StreamExFliter.withStreamFilter(al);

		StreamExFliter.withoutStreamMap(al);
		StreamExFliter.withStreamMap(al);
	}
}

```