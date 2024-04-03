// Java program to remove a key from singly linked list.

public class removeSpecificKey
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
	
	public void removeKey(int key)
	{
		ListNode current = head;
		ListNode temp = null;
		
		if (current != null && current.data == key)
		{
			head = current.next;
			return;
		}
		
		while (current != null && current.data != key)
		{
			temp = current;
			current = current.next;
		}
		
		if (current == null)
		{
			return;
		}
		
		temp.next = current.next;
	}
	
	public static void main(String args[])
	{
		removeSpecificKey rsk = new removeSpecificKey();
		
		rsk.head = new ListNode(1);
		ListNode second = new ListNode(3);
		ListNode third = new ListNode(4);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(7);
		
		rsk.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		rsk.display(rsk.head);
		
		rsk.removeKey(3);
		
		rsk.display(rsk.head);
	}
}