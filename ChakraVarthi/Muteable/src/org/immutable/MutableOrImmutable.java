package org.immutable;

public class MutableOrImmutable {
public static void main(String[] args) {
	//immutable
	//Dublicate value share the memory
	String i="12345";
	System.out.println(i);
	System.out.println(System.identityHashCode(i));
	
			String i1="6789";
			System.out.println(i1);
			System.out.println(System.identityHashCode(i1));
			
			String i2 ="12345";
			System.out.println(i2);
		
			System.out.println(i2);
			System.out.println(System.identityHashCode(i2));
			
			i=i+i1+i2 ;//it will create new memory
			System.out.println(System.identityHashCode(i));
			
			//muttable
			
			StringBuffer s1=new StringBuffer("Class");
			System.out.println(s1);
			System.out.println(System.identityHashCode(s1));
			
			StringBuffer s2=new StringBuffer("method");
			System.out.println(s2);
			System.out.println(System.identityHashCode(s2));
			
			
			
			s1=s2.append(s1);		
			System.out.println(s1);
			System.out.println(System.identityHashCode(s1));
			//memory will be shared
		
}
}





