// Java Program to insert a node at the end of a doubly linked list.

public class insertLastNode
{
	private ListNode head;
	private ListNode tail;
	private int length;
	
	private class ListNode
	{
		private ListNode next;
		private ListNode previous;
		private int data;
		
		public ListNode(int data)
		{
			this.data = data;
		}
	}
	
	public insertLastNode()
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
	
	public void insertLast(int value)
	{
		ListNode newNode = new ListNode(value);
		
		if (isEmpty())
		{
			head = newNode;
		}
		else
		{
			tail.next = newNode;
			newNode.previous = tail; 
		}
		tail = newNode;
		length++;
	}
	
	public static void main(String args[])
	{
		insertLastNode iln = new insertLastNode();
		
		iln.insertLast(11);
		
		iln.displayForward();
	}
}