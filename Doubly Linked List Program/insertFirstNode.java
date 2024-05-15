// Java program to insert node at the beginning of a doubly linked list.

public class insertFirstNode
{
	private ListNode head;
	private ListNode tail;
	private int length;
	
	private class ListNode
	{
		private int data;
		private ListNode next;
		private ListNode previous;
		
		public ListNode(int data)
		{
			this.data = data;
		}
	}
	
	public insertFirstNode()
	{
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	public boolean isEmpty()
	{
		return length == 0;
	}
	
	public void displayForward()
	{
		if (head == null)
		{
			return;
		}
		
		ListNode temp = head;
		while (temp != null)
		{
			System.out.print(temp.data + " --> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	public void insertFirst(int value)
	{
		ListNode newNode = new ListNode(value);
		
		if (isEmpty())
		{
			tail = newNode;
		}
		else
		{
			head.previous = newNode;
		}
		
		newNode.next = head;
		head = newNode;
		length++;
	}
	
	public static void main(String args[])
	{
		insertFirstNode ifn = new insertFirstNode();
		
		ifn.insertFirst(10);
		
		ifn.displayForward();
	}
}