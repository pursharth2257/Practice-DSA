// Java program to add a node at the end of the linked list.

public class insertEndNode
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
		System.out.println("null");
	}
	
	public void insertEnd(int num)
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
		insertEndNode ien = new insertEndNode();
		
		ien.head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(11);
		
		ien.head.next = second;
		second.next = third;
		third.next = fourth;
		
		ien.display(ien.head);
		
		ien.insertEnd(2);
		
		ien.display(ien.head);
	}
}	