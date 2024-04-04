// Java program to remove a loop from a singly linked list.

public class removeLoop
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
	
	public void removeTheLoop()
	{
		ListNode fastptr = head;
		ListNode slowptr = head;
		
		while (fastptr != null && fastptr.next != null)
		{
			fastptr = fastptr.next.next;
			slowptr = slowptr.next;
			
			if (fastptr == slowptr)
			{
				remove(slowptr);
				return;
			}
		}
	}
	
	public void remove(ListNode slowptr)
	{
		ListNode temp = head;
		
		while (temp.next != slowptr.next)
		{
			temp = temp.next;
			slowptr = slowptr.next;
		}
		slowptr.next = null;
	}
	
	public static void main(String args[])
	{
		removeLoop rl = new removeLoop();
		
		rl.head = new ListNode(1);
		ListNode second = new ListNode(3);
		ListNode third = new ListNode(4);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(7);
		
		rl.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = second;
		
		if (rl.findLoop())
		{
			System.out.println("Loop Founded!!");
		}
		else
		{
			System.out.println("Loop Not Founded!!");
		}
		
		rl.removeTheLoop();
		
		rl.display(rl.head);
	}
}