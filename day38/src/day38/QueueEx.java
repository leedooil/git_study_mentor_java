package day38;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		Queue<String>q=new LinkedList<>();
		//1. add(e):rear(�޺κ�)��ġ�� e ����
		q.add("apple");	
		q.add("banana");	
		q.add("cherry");	
		q.add("tomato");
		System.out.println(q);
		
		//2. E element:front�� ��ġ�� ������ ��ȯ
		System.out.println("element:"+q.element());
		
		//3. remove:front�� ��ġ�� �����͸� ��ȯ �� ����
		System.out.println("remove:"+q.remove());
		System.out.println(q);
		
		//4. offer(e):rear��ġ�� ������ ����
		q.offer("peach");
		System.out.println(q);
		
		//5. peek():front ��ġ�� �ִ� �������� �� ��ȯ
		System.out.println("peek:"+q.peek());
		System.out.println(q);
		
		//6. poll():front�� ��ġ�� �����͸� ��ȯ �� ����
		System.out.println("poll:"+q.poll());
		System.out.println(q);
	}

}