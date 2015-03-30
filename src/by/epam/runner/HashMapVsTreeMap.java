package by.epam.runner;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapVsTreeMap {
	public HashMapVsTreeMap(){
		
	}
	
	public static void resultHashMapVsTreeMap(){
		System.out.println("\n----- HashMapVsTreeMap -----");
		//----- Add elements --------
		System.out.println("\n---Add elements ----"); 
		Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer> ();
		int value = 123456; 
		int value1 =5555;
		//--- TreeMap 
		Date startAddTreeMapTime = new Date(); 
		for(int i = 0; i < 100000; i++) { 
			treeMap.put(i, value);
			} 
		Date finishAddTreeMapTime = new Date(); 
		long addTreeMapTime = finishAddTreeMapTime.getTime() - startAddTreeMapTime.getTime() ;
		System.out.println(//"startAddTreeSetTime = "+startAddTreeSetTime+
					//"\t finishAddTreeSetTime = "+finishAddTreeSetTime+
					"\n Result addTreeMapTime = "+addTreeMapTime+" ms");
		//--- HashMap
		Date startAddHashMapTime = new Date(); 
		for(int i = 0; i < 100000; i++) { 
			hashMap.put(i, value);
			} 
		Date finishAddHashMapTime = new Date(); 
		long addHashMapTime = finishAddHashMapTime.getTime() - startAddHashMapTime.getTime() ;
		System.out.println(//"startAddTreeSetTime = "+startAddTreeSetTime+
				//"\t finishAddTreeSetTime = "+finishAddTreeSetTime+
				"\n Result addHashMapTime = "+addHashMapTime+" ms");
	
		//----- Insert element --------
		//--- TreeMap 
		System.out.println("\n---Insert elements ----"); 
		int index = treeMap.size()/2;
		long startInsertTreeMapTime = System.nanoTime();
		treeMap.put(index, value1);
		long InsertTreeMapTime = System.nanoTime() - startInsertTreeMapTime;
		System.out.println(//"startInsertTreeMapTime = "+startInsertTreeMapTime+
				//"\t finishInsertHashSetTime = "+finishInsertHashSetTime+
				"\n Result InsertTreeMapTime = "+InsertTreeMapTime+" nano sec"); 
		// ----- HashMap 
		int index1 = hashMap.size()/2;
		long startInsertHashMapTime = System.nanoTime();
		hashMap.put(index1, value1);
		long InsertHashMapTime = System.nanoTime() - startInsertHashMapTime;
		System.out.println(//"startInserHashSetTime = "+startInserHashSetTime+
				//"\t finishInsertHashSetTime = "+finishInsertHashSetTime+
				"\n Result InsertHashMapTime = "+InsertHashMapTime+" nano sec"); 
		
		//----- Search element --------
		//------TreeMap
		System.out.println("\n---Search elements ----"); 
		long startSearchTreeMapTime = System.nanoTime();
		treeMap.containsValue(value1);
		long SearchTreeMapTime = System.nanoTime() - startSearchTreeMapTime;
		System.out.println(//"startSearchTreeSetTime = "+startSearchTreeMapTime+
				//"\t finishSearchTreeSetTime = "+finishSearchTreeSetTime+
				"\n Result SearchTreeMapTime = "+SearchTreeMapTime+" nano sec");
		//--- HashSet
		long startSearchHashMapTime = System.nanoTime();
		hashMap.containsValue(value1);
		long SearchHashMapTime = System.nanoTime() - startSearchHashMapTime;
		System.out.println(//"startSearchHashMapTime = "+startSearchHashMapTime+
					//"\t finishSearchHashSetTime = "+finishSearchHashSetTime+
					"\n Result SearchHashMapTime = "+SearchHashMapTime+" nano sec");
		
		//----- Delete element --------
		//--- TreeMap
		System.out.println("\n---Delete elements ----"); 
		long startDeleteTreeMapTime = System.nanoTime();
		treeMap.remove(value1);
		long DeleteTreeMapTime = System.nanoTime() - startDeleteTreeMapTime;
		System.out.println(//"startDeleteTreeMapTime = "+startDeleteTreeMapTime+
					//"\t finishDeleteTreeSetTime = "+finishDeleteTreeSetTime+
					"\n Result DeleteTreeMapTime = "+DeleteTreeMapTime+" nano sec");
		//--- HashMap
		long startDeleteHashMapTime = System.nanoTime();
		hashMap.remove(value1);
		long DeleteHashMapTime = System.nanoTime() - startDeleteHashMapTime;
		System.out.println(//"startDeleteHashMapTime = "+startDeleteHashMapTime+
						//"\t finishDeleteHashSetTime = "+finishDeleteHashSetTime+
						"\n Result DeleteHashMapTime = "+DeleteHashMapTime+" nano sec");
		
	}

}
