package com.amit.javacode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class StringTokenizerExample {
	
	public static void main(String[] args) {
		Stack stk = new Stack();
		String s = "position 1 no. @ durga is this";
		String dlimit = " ";
		Map<Integer, String> map = new HashMap<>();
		LinkedList<String> list = new LinkedList<>();
		
		Queue q = new LinkedList<>();
		
		
		StringTokenizer token = new StringTokenizer(s, dlimit);
		
		int i = token.countTokens();
		
		while(token.hasMoreElements())
		{
			
			//System.out.println(token.nextElement() );
//			map.put(i, (String) token.nextElement());
//			i--;
			//list.add((String) token.nextElement());
			//stk.addElement(token.nextElement());
			q.add(token.nextElement());
			
		}
		
		/*for(Entry<Integer,String> entry : map.entrySet())
		{
			System.out.print(entry.getValue() + " ");
		}*/

		/*Iterator x = list.descendingIterator();
		while(x.hasNext())
		{
			
			//System.out.print(x.next() + " ");
			stk.addElement(x.next());
		}*/
		
		System.out.println(q.toString());
		q.remove();
		System.out.println(q.toString());
		
		/*System.out.println(stk.toString());
		stk.remove(0);
		System.out.println(stk.toString());*/
		
		
	}

}
