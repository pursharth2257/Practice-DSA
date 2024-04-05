

public class deleteFirstNode
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
	
	public ListNode deleteFirst()
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
	
	public static void main(String args[])
	{
		deleteFirstNode dfn = new deleteFirstNode();
		
		dfn.head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(11);
		
		// connecting them together to form a chain :-
		
		dfn.head.next = second;
		second.next = third;
		third.next = fourth;
		
		dfn.display(dfn.head);
		
		dfn.deleteFirst();
		
		dfn.display(dfn.head);
	}
}