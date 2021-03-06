package com.techno.collectionmain;
import java.util.Iterator;
public class MyCustomArray implements Iterable<MyCustomArray>{
	private Object[] array;
	private int position;

	public MyCustomArray(int size) {
		array = new Object[size];
	}
	public void add(Object num) {
		if(position>=array.length) {
			grow();
		}
		array[position++] = num;
	}
	public int size() {
		return this.position;
	}
	public Object get(int index) {
		return array[index];
	}
	private void grow() {
		Object[] temp = new Object[array.length*2];
		System.arraycopy(array, 0, temp, 0, array.length);
		array=temp;
	}
	public void remove(int in) {
		for (int i = in; i < size(); i++) {
			array[i]=array[i+1];
		}
		position--;
	}
	public void remove1(Object obj) {
		for (int i = 0; i < array.length; i++) {
			if(array[i]==obj) {
				remove(i);
			}
		} 
	}
	public Iterator iterator() {
		return new MyItr();
	}
	private class MyItr implements Iterator{
		int index;
		@Override
		public boolean hasNext() {
			return (index<size())?true:false;
		}
		@Override
		public Object next() {
			return array[index++];
		}
	}
	@Override
	public String toString() {
		if(size()==0) {
			return "[]";
		}String string = "[" + array[0];
		for (int i = 1; i < size(); i++) {
			string += "," + array[i];
		}
		string += "]";
		return string;
	}

}
