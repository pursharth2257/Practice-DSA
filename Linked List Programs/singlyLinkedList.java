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
	
	public void insertSpecificNode(int num, int position)
	{
		ListNode node = new ListNode(num);
		
		if (position == 1)
		{
			node.next = head;
			head = node;
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
			node.next = current;
			previous.next = node;
		}
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
	
	public static boolean searchElement(ListNode head, int num)
	{
		if (head == null)
		{
			return false;
		}
		
		ListNode current = head;
		
		while (current != null)
		{
			if (current.data == num)
			{
				return true;
			}
			current = current.next;
		}
		return false;
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
		
		sll.insertSpecificNode(5, 4);
		
		sll.display();
		
		sll.deleteFirstNode();
		
		sll.display();
		
		sll.deleteLastNode();
		
		sll.display();
		
		sll.deleteSpecificNode(2);
		
		sll.display();
		
		if (sll.searchElement(head, 11))
		{
			System.out.println("Element found!!");
		}
		else
		{
			System.out.println("Element not found!!");
		}
	}
}