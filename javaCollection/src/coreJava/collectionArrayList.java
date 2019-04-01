package coreJava;

import java.util.ArrayList;

public class collectionArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a= new ArrayList<String>();
		a.add("java");
		a.add("amit");
		System.out.println(a);
		a.add(0,"selenium");
		System.out.println(a);
		System.out.println(a.contains("amit"));
		a.remove(0);
		a.remove("java");
		System.out.println(a);
		a.add("aayush");
		a.add("dell");
		System.out.println(a);
		System.out.println(a.get(1));
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.indexOf("dell"));
	}

}
