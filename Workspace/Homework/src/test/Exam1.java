package test;

import java.util.ArrayList;
import java.util.Stack;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a1 = 100;
		Integer a2 = 100;
		System.out.println(a1 == a2);
		boolean b = new Integer(100) == new Integer(100);
		System.out.println(b);
		
		Integer b1 = new Integer(100);
		Integer b2 = new Integer(100);
		System.out.println(b1 == b2);
		
		Integer c1 = 150;
		Integer c2 = 150;
		System.out.println(c1 == c2);
		
//		int n = 50;
//		Stack<Integer> s = new Stack<Integer>();
//		while(n > 0) {
//			s.push(n % 2);
//			n = n/2;
//		}
//		while (!s.isEmpty())
//			System.out.println(s.pop());
//		System.out.println();
		
//		String[] q = {"A", "B", "C"};
//		Stack<String> s = new Stack<String>();
//		int i = 0;
//		while(i < q.length) {
//			s.push(q[i]);
//			i++;
//		}
//		while (!s.isEmpty()) {
//			System.out.println(s.pop());
//		}
		
//		Node first = new Node();
		
		
//		Integer[] a = {1, 2, 3, 4, 5};
//		int j = a.length - 1;
//		int i = 0;
//		int max = 0;
//		while (j >= i) {
//			int k = i;
//			while (k <= j) {
//				int diff = a[j] - a[k];
//				if (diff > max) {
//					max = diff;
//				}
//				k++;
//			}
//			i++;
//		}
		
		
		
	}
	
	public class Node {
		String item;
		Node next;
	}

}
