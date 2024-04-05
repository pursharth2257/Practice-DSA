// Java program to delete last node in a linked list.

public class deleteLastNode
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
	
	public ListNode deleteLast()
	{
		if (head == null || head.next == null)
		{
			return head;
		}
		
		ListNode current = head;
		ListNode previous = null;
		
		while (current.next != null)
		{
			previous = current;
			current = current.next;
		}
		
		previous.next = null;
		return current;
	}
	
	public static void main(String args[])
	{
		deleteLastNode dln = new deleteLastNode();
		
		dln.head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(11);
		
		// connecting them together to form a chain :-
		
		dln.head.next = second;
		second.next = third;
		third.next = fourth;
		
		dln.display(dln.head);
		
		dln.deleteLast();
		
		dln.display(dln.head);
	}
}