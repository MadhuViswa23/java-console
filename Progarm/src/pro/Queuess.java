package pro;


import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queuess {

	public static void main(String args[]) {
		
		Queue<Integer> q = new PriorityQueue<>();
		
		q.add(200);
		q.add(345);
		q.add(250);
		q.add(600);
		System.out.println(q);
		
		Queue<String> que =  new PriorityQueue<>();
		que.add("pen");
		que.add("paper");
		que.add("box");
		
		
		System.out.println(que);
		System.out.println(que.peek());
		System.out.println(que.poll());
		
		Queue<String> st = new LinkedList<>();
		st.add("Italy");
		st.add("canada");
		st.add("Usa");
		
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.poll());
		System.out.println(st);
		
Queue<Integer> in = new LinkedList<>();
		
		in.add(2000);
		in.add(3435);
		in.add(3250);
		in.add(6040);
		System.out.println(in);
		
		
Queue<String> stt = new LinkedList<>();
		
		stt.add("madhu");
		stt.add("jeni");
		stt.add("siayana");
	
		System.out.println(stt.size());
		System.out.println(stt);
		System.out.println(stt.isEmpty());
		System.out.println(stt);
		
	}
}
