// Java program for implementing and displaying singly linked list.

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
	}
}