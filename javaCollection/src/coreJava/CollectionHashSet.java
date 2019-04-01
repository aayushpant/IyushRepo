package coreJava;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("he");
		hs.add("she");
		hs.add("she");
		hs.add("awesome");
		System.out.println(hs);
		System.out.println(hs.remove("she"));
		System.out.println(hs.isEmpty());
		hs.add("cool");
		Iterator<String>i = hs.iterator();
//        System.out.println(i.next());
        System.out.println("hi there");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
