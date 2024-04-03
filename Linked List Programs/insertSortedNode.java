// Java program to insert a node in a sorted singly Linked List.

public class insertSortedNode
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
	
	public ListNode insertNode(int value)
	{
		ListNode newNode = new ListNode(value);
		
		if (head == null)
		{
			return newNode;
		}
		
		ListNode current = head;
		ListNode temp = null;
		
		while (current != null && current.data < newNode.data)
		{
			temp = current;
			current = current.next;
		}
		
		newNode.next = current;
		temp.next = newNode;
		return head;
	}
	
	public static void main(String args[])
	{
		insertSortedNode isn = new insertSortedNode();
		
		isn.head = new ListNode(1);
		ListNode second = new ListNode(3);
		ListNode third = new ListNode(4);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(7);
		
		isn.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		isn.display(isn.head);
		
		isn.insertNode(5);
		
		isn.display(isn.head);
 	}
}