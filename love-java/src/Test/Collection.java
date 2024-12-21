package Test;

import java.util.*;

public class Collection {
	public static void main(String[] args) {
		Map<String, String> objMap = new HashMap<String, String>();
		List<Map<String, String>> lstObjMap = new LinkedList<Map<String, String>>();
		List<Map<String, String>> lstObjMapTest = new ArrayList<Map<String, String>>();

		objMap.put("id", "1");
		objMap.put("name", "Test1");
		lstObjMap.add(objMap);
		lstObjMapTest.add(objMap);

		objMap = new HashMap<String, String>();
		objMap.put("id", "2");
		objMap.put("name", "Test2");
		lstObjMap.add(objMap);
		lstObjMapTest.add(objMap);

		for (Map<String, String> map : lstObjMap) {
			System.out.println(map);
		}

		for (Map<String, String> map : lstObjMapTest) {
			System.out.println("Arlist: " + map);
		}
		
		Map<String, String> objMap1 = new LinkedHashMap<String, String>();
		
		objMap1.put("id", "1");
		objMap1.put("name", "Test1");
		lstObjMap.add(objMap1);
		lstObjMapTest.add(objMap1);
		
		for (Map<String, String> map : lstObjMapTest) {
			System.out.println("LinkedHashMap: " + map);
		}
	}
}
