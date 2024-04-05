// Java program to merge two sorted linked list.

public class mergeSortedList
{
	private ListNode head;
	
	private static class ListNode
	{
		private int data;
		private ListNode next;
		
		public ListNode(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	public void display(ListNode head)
	{
		ListNode current = head;
		
		while(current != null)
		{
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println(current);
	}
	
	public ListNode merge(ListNode a, ListNode b)
	{
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		
		while (a != null && b != null)
		{
			if (a.data <= b.data)
			{
				tail.next = a;
				a = a.next;
			}
			else
			{
				tail.next = b;
				b = b.next;
			}
			tail = tail.next;
		}
		
		if (a == null)
		{
			tail.next = b;
		}
		else
		{
			tail.next = a;
		}
		return dummy.next;
	}
	
	public static void main(String args[])
	{
		mergeSortedList msl = new mergeSortedList();
		
		ListNode a = new ListNode(1);
		ListNode second = new ListNode(3);
		ListNode third = new ListNode(4);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(7);
		
		a.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		ListNode b = new ListNode(1);
		ListNode second1 = new ListNode(3);
		ListNode third1 = new ListNode(4);
		ListNode fourth1 = new ListNode(4);
		ListNode fifth1 = new ListNode(7);
		
		b.next = second1;
		second1.next = third1;
		third1.next = fourth1;
		fourth1.next = fifth1;
		
		msl.display(a);
		msl.display(b);
		
		msl.display(msl.merge(a, b));
	}
}