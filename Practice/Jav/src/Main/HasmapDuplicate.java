package Main;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HasmapDuplicate {
	 public static void main(String args []) {
		 String str= "akshata";
		 String s1= " ";
		 char[] ch = new char[str.length()]; 
		  
	        // Copy character by character into array 
	        for (int i = 0; i < str.length(); i++) { 
	            ch[i] = str.charAt(i); 
	        } 		 
	        
	        for (char c : ch) { 
	            System.out.println(c); 
	        } 
		 Map<Character, Integer> m= new LinkedHashMap<>();
		 
		 
		 for (Character c : ch) { 
			   if (m.containsKey(c)) {  
	                m.put(c,( m.get(c) + 1));  
	            } else {  
	                m.put(c, 1);  
	            }  
	        }
		 
		  Set<Character> keys = m.keySet();  
		  
	        for (Character ch1 : keys) {  
	            if (m.get(ch1) == 1) {  
	               System.out.println(ch1 + "  is " + m.get(ch1) + " times");  
	                s1= s1+ ch1;
	            }  
	        }  
	        
	        
	        System.out.println("Dupplicate not "+s1);
		 
	 }
}
