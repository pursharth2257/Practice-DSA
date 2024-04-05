// Java program to detect a loop in a singly linked list.

public class detectLoop
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
	
	public boolean findLoop()
	{
		ListNode fastptr = head;
		ListNode slowptr = head;
		
		while (fastptr != null && fastptr.next != null)
		{
			fastptr = fastptr.next.next;
			slowptr = slowptr.next;
			
			if (fastptr == slowptr)
			{
				return true;
			}
		}
		return false;
	}
	
	public static void main(String args[])
	{
		detectLoop dl = new detectLoop();
		
		dl.head = new ListNode(1);
		ListNode second = new ListNode(3);
		ListNode third = new ListNode(4);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(7);
		
		dl.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = second;
		
		if (dl.findLoop())
		{
			System.out.println("Loop Founded!!");
		}
		else
		{
			System.out.println("Loop Not Founded!!");
		}
	}
}