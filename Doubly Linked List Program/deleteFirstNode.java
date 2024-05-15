// Java program to delete first node in a doubly linked list.

import java.util.*;

public class deleteFirstNode
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
	
	public deleteFirstNode()
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
			head = newNode;
		}
		else
		{
			head.previous = newNode;
			newNode.next = head;
		}
		head = newNode;
		length++;
	}
	
	public ListNode deleteFirst()
	{
		if (isEmpty())
		{
			throw new NoSuchElementException();
		}
		
		ListNode temp = head;
		if (head == tail)
		{
			tail = null;
		}
		else
		{
			head.next.previous = null;
		}
		head = head.next;
		temp.next = null;
		length--;
		return temp;
	}
	
	public static void main(String args[])
	{
		deleteFirstNode dfn = new deleteFirstNode();
		
		dfn.insertFirst(2);
		dfn.insertFirst(5);
		dfn.insertFirst(11);
		
		dfn.displayForward();
		
		dfn.deleteFirst();
		
		dfn.displayForward();
	}
}