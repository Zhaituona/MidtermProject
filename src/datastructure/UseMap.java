package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		List<String> cityOfUSA = new ArrayList<String>();
		cityOfUSA.add("NYC");
		cityOfUSA.add("Arlington");
		cityOfUSA.add("Westminster");

		List<String> cityOfCanada = new ArrayList<String>();
		cityOfCanada.add("Toronto");
		cityOfCanada.add("Vancover");
		cityOfCanada.add("Ottawa");

		List<String>   cityOfAustralia= new ArrayList<String>();
		cityOfAustralia.add("Sydney");
		cityOfAustralia.add("Perth");
		cityOfAustralia.add("Melbourne");

		Map<String,List<String>> map = new HashMap<String,List<String>>();

		map.put("USA" ,cityOfUSA);
		map.put("Canada",cityOfCanada);
		map.put("Australia" ,cityOfAustralia);
		for(Map.Entry<String , List<String>>   m : map.entrySet()){
			System.out.println(m.getKey()  + "  " + m.getValue());
		}
		System.out.println("Using while loop ************* ");

		Iterator<Map.Entry<String , List<String>>> it = map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry  value = it.next();
			System.out.println(value.getKey());
			System.out.println(value.getValue());
		}



	}

}
