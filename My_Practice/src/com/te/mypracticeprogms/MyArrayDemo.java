package com.te.mypracticeprogms;
public class MyArrayDemo {
	private Object[] array;
	private int position;
	public MyArrayDemo(int size) {
		array = new Object[size];
	}
	public void add(int ele) {
		if(array.length>this.position) {
			grow();
		}
		array[position++]=ele;
	}
	public int size() {
		return this.position=position;
	}
	public Object get(int index) {
		return array[index];
	}
	public void grow() {
		Object[] tempObjects = new Object[array.length*2];
		System.arraycopy(tempObjects, 0, tempObjects, 0, array.length);
		array = tempObjects;
		tempObjects=null;
	}
	public void remove(int index) {
		for (int i = index; i < array.length; i++) {
			array[i]=array[i+1];
		}
		position--;
	}
	public void removeEle(Object ele) {
		for (int i = 0; i < array.length; i++) {
			if(array[i]==ele) {
				remove(i);
			}
		}
	}
}
