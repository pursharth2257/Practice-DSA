// Java program to find n th node from the end of the linked list.

public class findNthNode
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
	
	public ListNode findNth(int n)
	{
		if (head == null)
		{
			return null;
		}
		
		if (n <= 0)
		{
			throw new IllegalArgumentException("Invalid Value: n =" + n);
		}
		
		ListNode refptr = head;
		ListNode mainptr = head;
		int count = 0;
		
		while (count < n)
		{
			if (refptr == null)
			{
				throw new IllegalArgumentException(n + " is bigger than the number of node in the list");
			}
			refptr = refptr.next;
			count++;
		}
		
		while (refptr != null)
		{
			refptr = refptr.next;
			mainptr = mainptr.next;
		}
		return mainptr;
	}
	
	public static void main(String args[])
	{
		findNthNode fnn = new findNthNode();
		
		fnn.head = new ListNode(19);
		ListNode second = new ListNode(34);
		ListNode third = new ListNode(5);
		ListNode fourth = new ListNode(11);
		
		fnn.head.next = second;
		second.next = third;
		third.next = fourth;
		
		fnn.display(fnn.head);
		
		ListNode NthFromEnd = fnn.findNth(3);
		
		System.out.println("Nth node from end is : " + NthFromEnd.data);
	}
}

