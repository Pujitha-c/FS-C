/*Given N integers, store them in a doubly linked list. 
Write a Java program to insert an element from beginning, middle and 
end of the doubly linked list.

Example:
5		\\size of list
2 8 6 4 9	\\elements of list (add at the end)
Doubly Linked List: 2 8 6 4 9
Enter an element to add at beginning of the list: 10
Updated Doubly Linked List: 10 2 8 6 4 9
Enter an element to add in the middle of the list: 5
Updated Doubly Linked List: 10 2 8 5 6 4 9
*/

import java.util.Scanner;
class Node
{  
	int data;  
	Node previous;  
	Node next;  
	public Node(int data) 
	{  
		this.data = data;  
	}  
}
public class Solution
{  
    Node head, tail = null;  
    int size;
	
	/* Write code here*/
	public void addAtEnd(int data)
	{
	    Node node=new Node(data);
	    if(head==null)
	    {
	        head=tail=node;
	        head.previous=null;
	        tail.next=null;
	    }
	    else{
	        tail.next=node;
	        node.previous=tail;
	        tail=node;
	        tail.next=null;
	    }
	    size++;
	}
	public void addInMid(int data)
	{
	    Node node=new Node(data);
	    if(head==null)
	    {
	        head=tail=node;
	        head.previous=null;
	        tail.next=null;
	    }
	    else{
	        Node curNode=head, temp=null;
	        int mid=(size%2==0)?(size/2):((size+1)/2);
	        for(int i=1;i<mid;i++)
	        {
	            curNode=curNode.next;
	        }
	        temp=curNode.next;
	        temp.previous=curNode;
	        curNode.next=node;
	        node.previous=curNode;
	        node.next=temp;
	        temp.previous=node;
	    }
	    size++;
	}
	public void addAtStart(int data)
	{
	    Node node=new Node(data);
	    if(head==null)
	    {
	        head=tail=node;
	        head.previous=null;
	        tail.next=null;
	    }
	    else{
	        head.previous=node;
	        node.next=head;
	        node.previous=null;
	        head=node;
	    }
	    size++;
	}
	public void display()
	{
	    Node cur=head;
	    if(head==null)
	    {
	        System.out.println("empty list");
	        return;
	    }
	    while(cur!=null)
	    {
	        System.out.print(cur.data+" ");
	        cur=cur.next;
	    }
	    System.out.println();
	}
	
    public static void main(String[] args) 
	{  
		Scanner sc=new Scanner(System.in);
        Solution list = new Solution();  
		
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
			list.addAtEnd(sc.nextInt());
		
		System.out.print("Doubly Linked List: ");
	    list.display();
	    
		System.out.print("Enter an element to add at beginning of the list: ");
	    int e1=sc.nextInt();
	    list.addAtStart(e1);
	    System.out.print("Updated Doubly Linked List: ");
	    list.display();
	    
		System.out.print("Enter an element to add in the middle of the list: ");
	    int e2=sc.nextInt();
	    list.addInMid(e2);
	    System.out.print("Updated Doubly Linked List: ");
	    list.display();
         
    }  
}  

/*Test cases:
case=1
input=5
2 8 6 4 9
10
5
output=
Doubly Linked List: 2 8 6 4 9
Enter an element to add at beginning of the list: 
Updated Doubly Linked List: 10 2 8 6 4 9
Enter an element to add in the middle of the list: 
Updated Doubly Linked List: 10 2 8 5 6 4 9

case=2
input=2
10 20
-5
-25
output=
Doubly Linked List: 10 20
Enter an element to add at beginning of the list: 
Updated Doubly Linked List: -5 10 20
Enter an element to add in the middle of the list: 
Updated Doubly Linked List: -5 10 -25 20

*/
