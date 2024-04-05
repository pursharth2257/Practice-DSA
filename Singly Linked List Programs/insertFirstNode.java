// Java program to add first node in a linked list.

public class insertFirstNode
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
	
	public void insertFirst(int num)
	{
		ListNode newNode = new ListNode(num);
		newNode.next = head;
		head = newNode;
	}
	
	public static void main(String args[])
	{
		insertFirstNode ifn = new insertFirstNode();
		
		ifn.head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(11);
		
		ifn.head.next = second;
		second.next = third;
		third.next = fourth;
		
		ifn.display(ifn.head);
		
		ifn.insertFirst(2);
		
		ifn.display(ifn.head);
	}
}	