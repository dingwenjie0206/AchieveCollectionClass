package com.jxau.collection;

public class Node {
	Node pre;
	Object object;
	Node next;
	
	public Node(){
		
	}

	public Node(Node pre, Object object, Node next) {
		super();
		this.pre = pre;
		this.object = object;
		this.next = next;
	}

	public Node getPre() {
		return pre;
	}

	public void setPre(Node pre) {
		this.pre = pre;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
	
}
