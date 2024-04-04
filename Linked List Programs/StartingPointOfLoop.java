// Java program to find the starting point of a loop in a singly linked list.

public class StartingPointOfLoop
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
	
	public ListNode findStartingPoint()
	{
		ListNode fastptr = head;
		ListNode slowptr = head;
		
		while (fastptr != null && fastptr.next != null)
		{
			fastptr = fastptr.next.next;
			slowptr = slowptr.next;
			
			if (fastptr == slowptr)
			{
				return getStartingPoint(slowptr);
			}
		}
		return null;
	}
	
	// Floyd's Cycle Detection Algorithm :-
	
	public ListNode getStartingPoint(ListNode slowptr)
	{
		ListNode temp = head;
		
		while (temp != slowptr)
		{
			temp = temp.next;
			slowptr = slowptr.next;
		}
		return temp;
	}
	
	public static void main(String args[])
	{
		StartingPointOfLoop spl = new StartingPointOfLoop();
		
		spl.head = new ListNode(1);
		ListNode second = new ListNode(3);
		ListNode third = new ListNode(4);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(7);
		
		spl.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = second;
		
		if (spl.findLoop())
		{
			System.out.println("Loop Founded!!");
		}
		else
		{
			System.out.println("Loop Not Founded!!");
		}
		
		System.out.println("Starting point of loop : " + spl.findStartingPoint().data);
	}
}