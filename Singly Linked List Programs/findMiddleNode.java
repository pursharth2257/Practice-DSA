// Java program to find middle node in a linked list.

public class findMiddleNode
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
	
	public ListNode findMiddle(ListNode head)
	{
		if (head == null)
		{
			return null;
		}
		
		ListNode slowptr = head;
		ListNode fastptr = head;
		
		while (fastptr != null && fastptr.next != null)
		{
			slowptr = slowptr.next;
			fastptr = fastptr.next.next;
		}
		return slowptr;
	}
	
	public static void main(String args[])
	{
		findMiddleNode fmn = new findMiddleNode();
		
		fmn.head = new ListNode(2);
		ListNode second = new ListNode(9);
		ListNode third = new ListNode(7);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(6);
		
		fmn.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		fmn.display(fmn.head);
		
		ListNode middleNode = fmn.findMiddle(fmn.head);
		
		System.out.println("The middle node of the linked list is : " + middleNode.data);
	}
}