package Test;

import java.util.*;

public class Collection {
	public static void main(String[] args) {
		Map<String, String> objMap = new HashMap<String, String>();
		Map<String, Object> objMap3 = new HashMap<String, Object>();
		List<Map<String, String>> lstObjMap = new LinkedList<Map<String, String>>();
		List<Map<String, String>> lstObjMapTest = new ArrayList<Map<String, String>>();
		List<Map<String, Object>> lstObjMapTest1 = new LinkedList<Map<String, Object>>();

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

		objMap3.put("id", "3");
		objMap3.put("name", "Test3");
		objMap3.put("age", 18);
		objMap3.put("parent", objMap1);
		lstObjMapTest1.add(objMap3);

		for (Map<String, Object> map : lstObjMapTest1) {
			System.out.println("LinkedHashMap-object: " + map);
		}

	}
}
