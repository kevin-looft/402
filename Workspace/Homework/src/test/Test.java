package test;

import java.util.Queue;
import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		for (Integer integer : stack) {
			System.out.println(integer);
		}
		for(int i = 0; i<=stack.size(); i++) {
			System.out.println();
		}

	}

}
