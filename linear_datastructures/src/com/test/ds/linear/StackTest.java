package com.test.ds.linear;

public class StackTest {

	public static void main(String[] args) {

		Stack<Integer> st = new Stack<Integer>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(88);
		st.push(1000);
		
		System.out.println(st.pop());
		System.out.println(st.empty());
		System.out.println(st.search(2));
	}

}
