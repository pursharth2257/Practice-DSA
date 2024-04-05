// Java program to remove duplicates from a sorted linked list from java.

public class removeDuplicateElements
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
		
		while (current != null)
		{
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println(current);
	}
	
	public void removeDuplicates()
	{
		if (head == null)
		{
			return;
		}
		
		ListNode current = head;
		
		while (current != null && current.next != null)
		{
			if (current.data == current.next.data)
			{
				current.next = current.next.next;
			}
			else 
			{
				current = current.next;
			}
		}
	}
	
	public static void main(String args[])
	{
		removeDuplicateElements rde = new removeDuplicateElements();
		
		rde.head = new ListNode(1);
		ListNode second = new ListNode(3);
		ListNode third = new ListNode(4);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(7);
		
		rde.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		rde.display(rde.head);
		
		rde.removeDuplicates();
		
		rde.display(rde.head);
 	}
}