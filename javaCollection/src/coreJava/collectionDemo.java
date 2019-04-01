package coreJava;

import java.util.ArrayList;

public class collectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,5,5,5,4,6,6,9,4};
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		for( int i =0; i < a.length; i++) {
			if (!ar.contains(a[i]))
			{
				ar.add(a[i]);
				int count = 1;
				for ( int j = i+1; j < a.length; j++) {
					if (a[i] == a[j])
					{
						count++;
					}
			}  
				System.out.println(a[i]);
				System.out.println(count);
				if (count == 1) {
					System.out.println(a[i] + " is the unique number in the given array ");
				}
			
		}
		
		}

	}
}
