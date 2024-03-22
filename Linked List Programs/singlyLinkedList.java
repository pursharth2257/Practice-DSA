// Java program for singly linked list.

public class singlyLinkedList
{
	
	// the code to implement linked list.
	
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
	
	// function to display the linked list.
	
	public void display()
	{
		ListNode current = head;
		
		while (current != null)
		{
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	public ListNode deleteFirstNode()
	{
		if (head == null)
		{
			return null;
		}
		
		ListNode temp = head;
		head = head.next;
		temp.next = null;
		return temp;
	}
	
	public ListNode deleteLastNode()
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
	
	public void deleteSpecificNode(int position)
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
		singlyLinkedList sll = new singlyLinkedList();
		
		sll.head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(11);
		
		// connecting them together to form a chain :-
		
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		
		sll.display();
		
		sll.deleteFirstNode();
		
		sll.display();
		
		sll.deleteLastNode();
		
		sll.display();
		
		sll.deleteSpecificNode(2);
		
		sll.display();
	}
}