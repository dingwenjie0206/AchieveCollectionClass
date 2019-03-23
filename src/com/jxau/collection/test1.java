package com.jxau.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class test1 {

	public static void main(String[] args) {
		MyArrayList list =  new MyArrayList();
		list.add("adasd");
		list.add(new Date());
		System.out.println(list.size());
		String string = (String)list.get(0);
		System.out.println(string);
	}
}
