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
	
	// function to know the length of the linked list.
	
	public int count()
	{
		int count = 0;
		
		ListNode current = head;
		
		while (current != null)
		{
			count++;
			current = current.next;
		}
		return count;
	}
	
	// function to add new node at start of linked list.
	
	public void insertFirstNode(int num)
	{
		ListNode newNode = new ListNode(num);
		newNode.next = head;
		head = newNode;
	}
	
	public void insertendNode(int num)
	{
		ListNode newNode = new ListNode(num);
		
		if (head == null)
		{
			head = newNode;
			return;
		}
		
		ListNode current = head;
		
		while (null != current.next)
		{
			current = current.next;
		}
		
		current.next = newNode;
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
		
		System.out.println("The length of the linked list is :" + sll.count());
		
		sll.insertFirstNode(2);
		
		sll.display();
		
		sll.insertendNode(9);
		
		sll.display();
	}
}