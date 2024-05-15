// Java program to implement and display a doubly linked list.

public class doublyLinkedList
{
	private ListNode head;
	private ListNode tail;
	private int length;
	
	private class ListNode
	{
		private int data;
		private ListNode next;
		private ListNode previous;
		
		private ListNode(int data)
		{
			this.data = data;
		}
	}
	
	public doublyLinkedList()
	{
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	public boolean isEmpty()
	{
		return length == 0;
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
		}
		newNode.previous = tail;
		tail = newNode;
		length++;
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
	
	public void displayBackward()
	{
		if (tail == null)
		{
			return;
		}
		ListNode temp = tail;
		
		while (temp != null)
		{
			System.out.print(temp.data + " --> ");
			temp = temp.previous;
		}
		System.out.println("null");
	}
	
	public static void main(String args[])
	{
		doublyLinkedList dll = new doublyLinkedList();
		dll.insertLast(1);
		dll.insertLast(10);
		dll.insertLast(15);
		dll.insertLast(25);
		
		dll.displayForward();
		
		dll.displayBackward();
	}
}