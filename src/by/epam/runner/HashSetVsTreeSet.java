package by.epam.runner;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetVsTreeSet {
	
	public HashSetVsTreeSet(){
		
	}
	
	public static void resultHashSetVsTreeSet(){
		System.out.println("\n----- HashSetVsTreeSet -----");
		Set<Integer> treeSet = new TreeSet<Integer>();
		Set<Integer> hashSet = new HashSet<Integer>();
		
		int value = 123456; 
		int value1 =5555;
		//--- TreeSet
		Date startAddTreeSetTime = new Date(); 
		for(int i = 0; i < 6000000; i++) { 
			treeSet.add(value);
			} 
		Date finishAddTreeSetTime = new Date(); 
		long addTreeSetTime = finishAddTreeSetTime.getTime() - startAddTreeSetTime.getTime() ;
		System.out.println(//"startAddTreeSetTime = "+startAddTreeSetTime+
				//"\t finishAddTreeSetTime = "+finishAddTreeSetTime+
				"\n Result addTreeSetTime = "+addTreeSetTime+" ms");
		//--- HashSet
		Date startAddHashSetTime = new Date(); 
		for(int i = 0; i < 6000000; i++) { 
			hashSet.add(value);
			}
		Date finishAddHashSetTime = new Date(); 
		long addHashSetTime = finishAddHashSetTime.getTime() - startAddHashSetTime.getTime() ;
		System.out.println(//"startAddHashSetTime = "+startAddHashSetTime+
				//"\t finishAddHashSetTime = "+finishAddHashSetTime+
				"\n Result addHashSetTime = "+addHashSetTime+" ms");
		
		//----- Insert element --------
		System.out.println("\n---Insert element  ----"); 
		//--- TreeSet
		long startInsertTreeSetTime = System.nanoTime();
		treeSet.add(value1);
		long InsertTreeSetTime = System.nanoTime() - startInsertTreeSetTime;
		System.out.println(//"startInsertTreeSetTime = "+startInsertTreeSetTime+
				//"\t finishInsertTreeSetTime = "+finishInsertTreeSetTime+
				"\n Result InsertTreeSetTime = "+InsertTreeSetTime+" nano sec");
		//--- HashSet
		long startInserHashSetTime = System.nanoTime();
		hashSet.add(value1);
		long InsertHashSetTime = System.nanoTime() - startInserHashSetTime;
		System.out.println(//"startInserHashSetTime = "+startInserHashSetTime+
				//"\t finishInsertHashSetTime = "+finishInsertHashSetTime+
				"\n Result InsertHashSetTime = "+InsertHashSetTime+" nano sec"); 
				
		//----- Search element --------
		//--- TreeSet
		System.out.println("\n---Search elements ----"); 
		long startSearchTreeSetTime = System.nanoTime();
		treeSet.contains(value1);
		long SearchTreeSetTime = System.nanoTime() - startSearchTreeSetTime;
		System.out.println(//"startSearchTreeSetTime = "+startSearchTreeSetTime+
				//"\t finishSearchTreeSetTime = "+finishSearchTreeSetTime+
				"\n Result SearchTreeSetTime = "+SearchTreeSetTime+" nano sec");
		//--- HashSet
		long startSearchHashSetTime = System.nanoTime();
		hashSet.contains(value1);
		long SearchHashSetTime = System.nanoTime() - startSearchHashSetTime;
		System.out.println(//"startSearchHashSetTime = "+startSearchHashSetTime+
					//"\t finishSearchHashSetTime = "+finishSearchHashSetTime+
					"\n Result SearchHashSetTime = "+SearchHashSetTime+" nano sec");
				
		//----- Delete element --------
		System.out.println("\n---Delete elements ----"); 
		//--- TreeSet
		long startDeleteTreeSetTime = System.nanoTime();
		treeSet.remove(value1);
		long DeleteTreeSetTime = System.nanoTime() - startDeleteTreeSetTime;
		System.out.println(//"startDeleteArrayListTime = "+startDeleteTreeSetTime+
					//"\t finishDeleteTreeSetTime = "+finishDeleteTreeSetTime+
					"\n Result DeleteTreeSetTime = "+DeleteTreeSetTime+" nano sec");
		//--- HashSet
		long startDeleteHashSetTime = System.nanoTime();
		hashSet.remove(value1);
		long DeleteHashSetTime = System.nanoTime() - startDeleteHashSetTime;
		System.out.println(//"startDeleteHashSetTime = "+startDeleteHashSetTime+
						//"\t finishDeleteHashSetTime = "+finishDeleteHashSetTime+
						"\n Result DeleteHashSetTime = "+DeleteHashSetTime+" nano sec");
	}
}
