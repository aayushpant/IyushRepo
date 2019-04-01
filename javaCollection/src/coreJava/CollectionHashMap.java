package coreJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hs = new HashMap<String, String>();
		hs.put("1", "ctytech");
		hs.put("2", "city_remit");
		hs.put("46","cityConnect");
		System.out.println(hs);
		hs.remove("46");
		System.out.println(hs);
		hs.put("344","cityExpress" );
		System.out.println(hs);
		Set sn = hs.entrySet();
		Iterator i = sn.iterator();
		
		while(i.hasNext())
		{
//			System.out.println(i.next());
			Map.Entry mp = (Map.Entry)i.next();
//			System.out.println(i.next());
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
	}

}
