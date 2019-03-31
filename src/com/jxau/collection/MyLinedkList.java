package com.jxau.collection;

import java.util.List;

public class MyLinedkList {

	private Node first;
	private Node last;
	private int size;
	
	public void add(Object object) {
		Node node = new Node();
		if(first == null){
			
			node.setPre(null);
			node.setObject(object);
			node.setNext(null);
			first = node;
			last = node;
		}else{
			//直接往last结点后增加新的结点
			node.setPre(last);
			node.setObject(object);
			node.setNext(null);
			
			last.setNext(node);
			
			last = node;
		}	
		size++;
	}
	
	public int size() {
		return size;
	}
	
	public Object get(int index){
		rangeCheck(index);
		Node tmp = node(index);
		if(tmp!=null){
			return tmp.object;
		}
		return null;
	}
	
	public void remove(int index){
		Node tmp = node(index);
		if(tmp!=null){
			Node up = tmp.pre;
			Node down = tmp.next;
			up.next = down;
			down.pre = up;
		}
		size--;
	}
	
	public void add(int index,Object object){
		Node tmp = node(index);
		Node newNode = new Node();
		newNode.object = object;
		if(tmp != null){
			Node up = tmp.pre;
			up.next = newNode;
			newNode.pre = up;
			
			newNode.next = tmp;
			tmp.pre = newNode;
			size++;
		}
	}
	
	public Node node(int index){
		Node tmp = null;
		if(first==null){
			tmp = first;
			for(int i=0;i<index;i++){
				tmp = tmp.next;
			}
		}
		return tmp;
	}
	private void rangeCheck(int index){
		 if(index<0||index<=size ){
			 try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		 }
	 }
	
	public static void main(String[] args) {
		MyLinedkList myLinedkList = new MyLinedkList();
		myLinedkList.add("adasdasd");
		myLinedkList.add("asdfeqw");
		System.out.println(myLinedkList.size());
	}
}

