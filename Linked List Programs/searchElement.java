public class searchElement
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
	
	public void display()
	{
		ListNode current = head;
		
		while (current != null)
		{
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println(current);
	}
	
	public boolean find(int searchKey)
	{
		if (head == null)
		{
			return false;
		}
		
		ListNode current = head;
		
		while (current != null)
		{
			if (current.data == searchKey)
			{
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	public static void main(String args[])
	{
		searchElement se = new searchElement();
		
		se.head = new ListNode(10);
		ListNode second = new ListNode(11);
		ListNode third = new ListNode(5);
		ListNode fourth = new ListNode(9);
		
		se.head.next = second;
		second.next = third;
		third.next = fourth;
		
		se.display();
		
		if (se.find(5))
		{
			System.out.println("Search key found!");
		}
		else
		{
			System.out.println("Search Key not found!");
		}
	}
}