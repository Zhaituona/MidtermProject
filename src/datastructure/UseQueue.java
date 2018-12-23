package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(12);
		q.add(36);
		q.add(5);
		q.add(8);
		//System.out.println(q);
		// retrieve value using for each loop
		//for(Integer v : q){
		//System.out.println("Queue value"  +  " " + v );



		//int a = ((LinkedList<Integer>) q).getFirst();
		//while(a< ((LinkedList<Integer>) q).getLast()){
		////System.out.println(a);
		///a++;


		if(q.peek()==12){
			System.out.println("They are equal");
		}
		else{
			System.out.println("They are not equal");
		}
		((LinkedList<Integer>) q).removeLast();

		System.out.println(q);
		q.poll();
		System.out.println(q);

	}

}


