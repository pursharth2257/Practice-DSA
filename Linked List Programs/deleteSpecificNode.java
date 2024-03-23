// Java program to delete a specific node at a specific position.

public class deleteSpecificNode
{
	private ListNode head;
	
	private static class ListNode
	{
		private int data;
		private ListNode next;
		
		public ListNode(int data)
		{
			this.data = data;
			this.next = next;
		}
	}
	
	public void display(ListNode head)
	{
		ListNode current = head;
		
		while (current != null)
		{
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println(current);
	}
	
	public void deleteSpecific(int position)
	{
		if (position == 1)
		{
			head = head.next;
		}
		
		else
		{
			ListNode previous = head;
			int count = 1;
			
			while (count < position - 1)
			{
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next = current.next;
		}
	}
	
	public static void main(String args[])
	{
		deleteSpecificNode dsn = new deleteSpecificNode();
		
		dsn.head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(11);
		
		// connecting them together to form a chain :-
		
		dsn.head.next = second;
		second.next = third;
		third.next = fourth;
		
		dsn.display(dsn.head);
		
		dsn.deleteSpecific(1);
		
		dsn.display(dsn.head);
	}
}
