import java.util.*;

public class Stack_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<Integer>();
		
		/*
		st.add(1);
		st.add(2);
		st.add(3);
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st);
		*/
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		/*
		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.peek());
		*/
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		/*
		pq.add(10);
		pq.add(4);
		pq.add(6);
		pq.add(20);
		pq.add(15);
		System.out.println(pq);
		*/
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(3);
		stack.add(2);
		stack.add(7);
		stack.add(3);
		stack.add(3);
		stack.add(4);
		stack.add(1);
		stack.add(1);
		stack.add(4);
		Queue<Integer> queue = new LinkedList<Integer>();
		TreeSet<Integer> set = new TreeSet<Integer>();
		while(!stack.isEmpty()) {
			if(stack.peek() % 2 == 0) {
				queue.add(stack.pop());
			} else {
				set.add(stack.pop());
			}
		}
		for(int n : set) {
			stack.push(n);
		}
		while(!queue.isEmpty()) {
			stack.push(queue.remove());
		}
		System.out.println(stack);
		
	}

}
