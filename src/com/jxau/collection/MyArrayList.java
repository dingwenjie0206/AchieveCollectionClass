package com.jxau.collection;

public class MyArrayList {

	private Object[] elementData;
	private int size;
	public MyArrayList(){
		this(10);
	}
	public int size(){
		return size;
	}
	 public MyArrayList(int initialCapacity){
		 if(initialCapacity<0){
			 try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		 }
		 elementData =  new Object[initialCapacity];
	 }
	 public void add(Object object){
		 //数组扩容和数据的拷贝
		ensureCapacity();
		 elementData[size] = object;
		 size++;
	 }
	 
	 public Object get(int index){
		 rangeCheck(index);
		 return elementData[index];
	 }
	 public void remove(int index){
		 rangeCheck(index);
		 //删除指定位置的对象
		 int numMove = size - index - 1;
		 if(numMove > 0){
			 System.arraycopy(elementData, index + 1, elementData, index, numMove);	 
		 }
		 elementData[--size] = null;
	 }
	 
	 public void remove(Object object){
		 
		 for(int i = 0;i<size ;i++){
			 if(get(i).equals(object)){
				 remove(i);
			 }
		 }
	 }
	 
	 public Object set(int index,Object object){
		 rangeCheck(index);
		 Object oldValue = elementData[index];
		 elementData[index] = object;
		 return oldValue;
	 }
	 
	 public void add(int index,Object object){
		 rangeCheck(index);
		 
		 ensureCapacity();
		 System.arraycopy(elementData, index, elementData,index+1,size -index);
		 elementData[index] = object;
		 size ++;
	 }
	 //扩容
	 private void ensureCapacity(){
		 if(size==elementData.length){
			 Object[] newArray = new Object[size*2+1];
			 System.arraycopy(elementData, 0, newArray, 0, elementData.length);
			 elementData = newArray;
		 }
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
	/*
	 *  public static void main(String[] args) {
		MyArrayList myArrayList = new MyArrayList(3);
		myArrayList.add("asf");
		myArrayList.add("asdasfaf");
		System.out.println(myArrayList.size());
		System.out.println(myArrayList.get(1));
	}*/
}
