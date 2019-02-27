package com.test.ds.linear;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
	
	List<T> arrayLst = new ArrayList<T>();
	static int index = 0;
	
	public void push(T element) {
		
		arrayLst.add(element);
		index++;
		
	}

	public T pop() {
		int topIndex = arrayLst.size()-1;
		T topElement = arrayLst.get(topIndex);
		arrayLst.remove(topIndex);
		return topElement;
	}
	
	public boolean empty() {
		
		if(arrayLst!=null && arrayLst.size()>0) {
			return false;
		}else {
			return true;
		}
	}
	
	public int search(T element) {
		return arrayLst.indexOf(element);
		
	}
	
}
