package by.epam.runner;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {
	public ArrayListVsLinkedList(){
		
	}
	
	public static void resultArrayListVsLinkedList(){
		System.out.println("\n----- ArrayListVsLinkedList -----");
		//----- Add elements --------
		System.out.println("---Add elements ----"); 
		List<Integer> linkedList = new LinkedList<Integer>(); 
		List<Integer> arrayList = new ArrayList<Integer>(); 
		int value =123456; 
		//--- ArrayList
		Date startAddArrayListTime = new Date(); 
		for(int i = 0; i < 6000000; i++) { 
			arrayList.add(value); 
			} 
		Date finishAddArrayListTime = new Date(); 
		long addArrayListTime = finishAddArrayListTime.getTime() - startAddArrayListTime.getTime() ;
		System.out.println(//"startAddArrayListTime = "+startAddArrayListTime+
				//"\t finishAddArrayListTime = "+finishAddArrayListTime+
				"\n Result addArrayListTime = "+addArrayListTime+" ms");
		//--- LinkedList
		Date startAddLinkedTime = new Date();
		for(int i = 0; i < 6000000; i++) { 
			linkedList.add(value); 
			} 
		Date finishAddLinkedTime = new Date(); 
		long addLinkedListTime = finishAddLinkedTime.getTime() - startAddLinkedTime.getTime(); 
		System.out.println(//"startAddLinkedTime = "+startAddLinkedTime+
				//"\t finishAddLinkedTime = "+finishAddLinkedTime+
				"\n Result addLinkedListTime = "+addLinkedListTime+" ms");
		
		//----- Insert element --------
		//--- ArrayList
		System.out.println("\n---Insert element  ----"); 
		int value1 =5555;
		int index = arrayList.size()/2;
		Date startInsertArrayListTime = new Date(); 
		arrayList.add(index, value1);
		Date finishInsertArrayListTime = new Date();
		long InsertArrayListTime = finishInsertArrayListTime.getTime() - startInsertArrayListTime.getTime() ;
		System.out.println(//"startInsertArrayListTime = "+startInsertArrayListTime+
				//"\t finishInsertArrayListTime = "+finishInsertArrayListTime+
				"\n Result InsertArrayListTime = "+InsertArrayListTime+" ms");
		//--- LinkedList
		index = linkedList.size()/2;
		Date startInsertLinkedTime = new Date(); 
		linkedList.add(index, value1);
		Date finishInsertLinkedListTime = new Date(); 
		long InsertLinkedListTime = finishInsertLinkedListTime.getTime() - startInsertLinkedTime.getTime(); 
		System.out.println(//"startInsertLinkedTime = "+startInsertLinkedTime+
				//"\t finishInsertLinkedListTime = "+finishInsertLinkedListTime+
				"\n Result InsertLinkedListTime = "+InsertLinkedListTime+" ms");
		
		//----- Search element --------
		System.out.println("\n---Search elements ----"); 
		//--- ArrayList
		Date startSearchArrayListTime = new Date(); 
		arrayList.contains(value1);
		Date finishSearchArrayListTime = new Date();
		long SearchArrayListTime = finishSearchArrayListTime.getTime() - startSearchArrayListTime.getTime() ;
		System.out.println(//"startSearchArrayListTime = "+startSearchArrayListTime+
				//"\t finishSearchArrayListTime = "+finishSearchArrayListTime+
				"\n Result SearchArrayListTime = "+SearchArrayListTime+" ms");
		//--- LinkedList
		Date startSearchLinkedTime = new Date(); 
		linkedList.contains(value1);
		Date finishSearchLinkedListTime = new Date(); 
		long SearchLinkedListTime = finishSearchLinkedListTime.getTime() - startSearchLinkedTime.getTime(); 
		System.out.println(//"startSearchLinkedTime = "+startSearchLinkedTime+
					//"\t finishSearchLinkedListTime = "+finishSearchLinkedListTime+
					"\n Result SearchLinkedListTime = "+SearchLinkedListTime+" ms");
		
		
		//----- Delete element --------
		System.out.println("\n---Delete elements ----"); 
		//--- ArrayList
		//Date startDeleteArrayListTime = new Date(); 
		long startDeleteArrayListTime = System.nanoTime();
		arrayList.remove(value1);
		//Date finishDeleteArrayListTime = new Date();
		//long DeleteArrayListTime = finishDeleteArrayListTime.getTime() - startDeleteArrayListTime.getTime() ;
		long DeleteArrayListTime = System.nanoTime() - startDeleteArrayListTime;
		System.out.println(//"startDeleteArrayListTime = "+startDeleteArrayListTime+
					//"\t finishDeleteArrayListTime = "+finishDeleteArrayListTime+
					"\n Result DeleteArrayListTime = "+DeleteArrayListTime+" nano sec");
		//--- LinkedList
		//Date startDeleteLinkedTime = new Date(); 
		long startDeleteLinkedTime = System.nanoTime();
		linkedList.remove(value1);
		//Date finishDeleteLinkedListTime = new Date(); 
		//long DeleteLinkedListTime = finishDeleteLinkedListTime.getTime() - startDeleteLinkedTime.getTime(); 
		long DeleteLinkedListTime = System.nanoTime() - startDeleteLinkedTime;
		System.out.println(//"startDeleteLinkedTime = "+startDeleteLinkedTime+
						//"\t finishDeleteLinkedListTime = "+finishDeleteLinkedListTime+
						"\n Result DeleteLinkedListTime = "+DeleteLinkedListTime+" nano sec");
	}

}
