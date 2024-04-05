// Java program to add two numbers taken from two reversed singly linked list.

public class sumOfTwoList
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
		
		while(current != null)
		{
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println(current);
	}
	
	public ListNode sum(ListNode a, ListNode b)
	{
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		int carry = 0;
		
		while (a != null || b != null)
		{
			int x = (a != null) ? a.data : 0;
			int y = (b != null) ? b.data : 0;
			int sum = carry + x + y;
			
			carry = sum / 10;
			
			tail.next = new ListNode(sum % 10);
			tail = tail.next;
			if (a != null) a = a.next;
			if (b != null) b = b.next;
		}
		
		if (carry > 0)
		{
			tail.next = new ListNode(carry);
		}
		return dummy.next;
	}
	
	public static void main(String args[])
	{
		sumOfTwoList stl = new sumOfTwoList();
		
		ListNode a = new ListNode(1);
		ListNode second = new ListNode(3);
		ListNode third = new ListNode(4);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(7);
		
		a.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		ListNode b = new ListNode(1);
		ListNode second1 = new ListNode(3);
		ListNode third1 = new ListNode(4);
		ListNode fourth1 = new ListNode(4);
		ListNode fifth1 = new ListNode(7);
		
		b.next = second1;
		second1.next = third1;
		third1.next = fourth1;
		fourth1.next = fifth1;
		
		stl.display(a);
		stl.display(b);
		
		stl.display(stl.sum(a, b));
	}
}