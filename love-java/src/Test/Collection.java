package Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

import com.fasterxml.jackson.databind.ObjectMapper;

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

//		InputStream file = Collection.class.getResourceAsStream("data.json"); // đọc path tương đối
//		InputStream file = Collection.class.getClassLoader().getResourceAsStream("data.json"); // đọc path tương đối

//		File file = new File("bin/Test/data.json"); // đọc path tuyệt đối
//		File file = new File("srcs/test/resoucres/data/data.json");
		File file = new File("src/Test/data.json");
		System.out.println(file);
		ObjectMapper objectMapper = new ObjectMapper();

		try {
			// Chuyển JSON thành Map
			@SuppressWarnings("unchecked")
			Map<String, Object> data = objectMapper.readValue(file, Map.class);

			// In dữ liệu ra console
			System.out.println(data.get("test"));

			@SuppressWarnings("unchecked")
			List<Map<String, Object>> lstData = (List<Map<String, Object>>) data.get("test");
			for (Map<String, Object> map : lstData) {
				System.out.println("Get object: " + map);
				System.out.println("Get value of a propertier object: -----> " + map.get("value01"));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
