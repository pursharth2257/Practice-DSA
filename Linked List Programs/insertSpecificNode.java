// Java program to add specific node at a specific position in Linked list.

public class insertSpecificNode
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
	
	public void insert(int num, int position)
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
	
	public static void main(String args[])
	{
		insertSpecificNode isn = new insertSpecificNode();
		
		isn.head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(11);
		
		isn.head.next = second;
		second.next = third;
		third.next = fourth;
		
		isn.display(isn.head);
		
		isn.insert(5, 4);
		
		isn.display(isn.head);
	}
}