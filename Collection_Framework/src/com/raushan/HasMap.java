package com.raushan;
import java.util.*;
public class HasMap {
	
	public static void main(String args[])
	{
		HashMap<String,Integer> courses = new HashMap<>();
		
		
		courses.put("Core Java", 4000);
		courses.put("Basic Python", 2000);
		courses.put("Rust", 1400);
		courses.put("Android", 1400);
		
		System.out.println(courses);
		
		courses.forEach((e1,e2)->{
			System.out.println(e1+"=>"+e2);
		});
		
		System.out.println(courses.get("Core Java"));
	}

}
