package com.ghouri;

import java.util.ArrayList;

public class ArrayListDemo 
{
	public static void main(String args[])
	{
		ArrayList al=new ArrayList();
		System.out.println("size of al="+al.size());
		System.out.println("contents of in al"+al);
		al.add("INDIA");
		al.add("Pakistan");
		al.add("America");
		al.add("England");
		al.add("Australia");
		al.add("Bangladish");
		System.out.println("Objects are added after the size of al="+al.size());
		System.out.println("contents in al after adding objects"+al);
		al.add(3,"Saudi Arabia");
		System.out.println("size="+al.size());
		System.out.println("contents in al"+al);
		al.remove(2);
		System.out.println("size="+al.size());
		System.out.println("contents in al"+al);
		al.remove("England");
		System.out.println("size="+al.size());
		System.out.println("contents in al"+al);
		System.out.println(al.contains("Bangladish"));
		System.out.println(al.get(2));
		System.out.println(al.isEmpty());
		al.clear();
		System.out.println(al.size());
		System.out.println(al);
		
	}

}
