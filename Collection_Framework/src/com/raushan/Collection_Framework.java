package com.raushan;
import java.util.*;
public class Collection_Framework {

	
	public static void main(String args[])
	{
		System.out.println("Welcome to java collection framework");
		
		
		/*
		 * creating collection 
		 * 1. type safe collection - same type of objects are added to collection 
		 * 2. non type safe collection - different types of elements can be added to collection 
		 */
		
		
		
		//Type safe collection 
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Durgesh");
		//names.add(2);
		names.add("Sitara");
		names.add("Roshni");
		names.add("Vandana");
		names.add("Vandana");
		
		System.out.println(names);
		//index wise get data 
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		
	    //remove 
		names.remove(0);
		
		//size 
		System.out.println("Size ="+names.size());
		
		
		//calls equals method 
		System.out.println(names.contains("Durgesh"));
		
		
		//check for empty 
		
		System.out.println(names.isEmpty());
		
		//setting value 
		names.set(1, "Ram");
		
		names.add(1,"SaiRam");
		
		
		
		Vector<String> vector = new Vector<>();
		vector.addAll(names);
		
		System.out.println("Vector"+vector);
		
		
		
		System.out.println("____________________________________________");
		
		HashSet<Double> nms = new HashSet<>();
		
		nms.add(12.21); //auto-box 
		nms.add(23.43);
		nms.add(new Double(22.3));
		nms.add(5.3);
		
		
		System.out.println(nms);
		
		
		
		TreeSet<Double> tset = new TreeSet<>();
		tset.addAll(nms);
		
		System.out.println(tset);
		
		
	
		
		//non type safe 
		LinkedList list = new LinkedList();
		
		list.add("Sachin");
		list.add("101");
		list.add(44);
		list.add(true);
		
		
		System.out.println(list);
		
		//traversal
		//for each loop
		
		for(String str:names)
		{
			System.out.println(str + "\t" +str.length());
			StringBuffer br = new StringBuffer(str);
			
			System.out.println(br.reverse());
		}
		
		
		System.out.println("__________________________******");
		
		//traversing using iterator 
		
		Iterator<String> itr =  names.iterator();
		
		while(itr.hasNext())
		{
			String next =itr.next();
			System.out.println(next);
					
		}
		
		
		System.out.println("__________________________*#######***");
		
		//backward traversal of collection
		
		ListIterator<String> itr1 =names.listIterator(names.size());
		while(itr1.hasPrevious())
		{
			String previous = itr1.previous();
			System.out.println(previous);
		}
		
		
		
		//for each method -- java 8 feature 
		
		System.out.println("for each_____*#######***");
		
		names.forEach(e->{
			System.out.println(e);
		});
		
		System.out.println("sorting of elements _____________________________");
		
		
		TreeSet<String> set = new TreeSet<>();
		set.addAll(names);
		set.forEach(e->{
			System.out.println(e);
		});
		
		
		
		
		
	}
}



//import util package 