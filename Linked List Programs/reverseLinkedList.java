// Java program to reverse a singly Linked list.

public class reverseLinkedList
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
	
	public ListNode reverse(ListNode head)
	{
		if (head == null)
		{
			return head;
		}
		
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		
		while (current != null)
		{
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}
	
	public static void main(String args[])
	{
		reverseLinkedList rll = new reverseLinkedList();
		
		rll.head = new ListNode(3);
		ListNode second = new ListNode(8);
		ListNode third = new ListNode(5);
		ListNode fourth = new ListNode(7);
		
		rll.head.next = second;
		second.next = third;
		third.next = fourth;
		
		rll.display(rll.head);
		
		ListNode reverseListHead = rll.reverse(rll.head);
		
		rll.display(reverseListHead);
	}
}