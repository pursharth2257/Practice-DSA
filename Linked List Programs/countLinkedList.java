// Java program to count number of node in linked list.

public class countLinkedList
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
	
	public static void main(String args[])
	{
		countLinkedList cll = new countLinkedList();
		
		cll.head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(11);
		
		cll.head.next = second;
		second.next = third;
		third.next = fourth;
		
		cll.display(cll.head);
		
		System.out.println("The length of the linked list is :" + cll.count());
	}
}