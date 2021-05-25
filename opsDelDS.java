/* THIS QUESTION HASN'T BEEN SOLVED COMPLETELY


Given N integers, store them in a singly linked list. Write a Java program to delete
an element from beginning, middle and end of the linked list.

Example:
Input=
6	\\N
1 2 3 4 5 6		\\Elements of the list
Output=
Given Linked list: 1 2 3 4 5 6
Linked list after deletion of first element: 2 3 4 5 6
Linked list after deletion of middle element: 2 3 5 6
Linked list after deletion of last element: 2 3 5
Enter the element to be deleted: 5
Linked list after deletion of specified element: 2 3

*/
import java.util.*;
class Node{
    Node head;
    int data;
    Node next;
  /*  Node(int d){
        data=d;
        next=null;
    }*/
}
class LinkedList
{
    Node head;
    public void add(int data)
    {
        Node node=new Node();
        node.data=data;
        node.next=null;
        if(head==null)
        {
            head=node;
        }
        else{
            Node n=head;
            while(n.next!=null)
            {
                n=n.next;
            }
            n.next=node;
        }
    }
    public void show()
    {
        Node node=head;
        while(node.next!=null)
        {
            System.out.print(node.data+" ");
            node=node.next;
        }
        System.out.println(node.data);
        
    }

    public void delFirst()
    {
        Node temp=head;
        head=head.next;
    }
    public Node midNode(Node node)
    {
      //  Node head;
        if(node==null || node.next==null){
        return null;}
        Node sp,fp,prev;
        sp=fp=prev=node;
        while(fp!=null && fp.next!=null)
        {
            prev=sp;
            sp=sp.next;
            fp=fp.next.next;
        }
        prev.next=sp.next;
        return node;
        
    }
    public Node delLast(Node head)
    {
        if(head==null){
        return head;}
        Node last=head;
        Node prevLast=null;
        while(last.next!=null)
        {
            prevLast=last;
            last=last.next;
        }
        prevLast.next=null;
        return last;
        
    }
    public void delNode(Node node)
    {
        node.data=node.next.data;
        node.next=node.next.next;
    }
    

}

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    LinkedList l=new LinkedList();
	    Node head=null;
	    for(int i=0;i<n;i++)
	    {
	        int s=sc.nextInt();
	        l.add(s);
	    }
	    l.show();
	    l.delFirst();
	    l.show();
	    l.midNode(head);
	    l.printLinkedList();
	    //l.delLast(head);
	    //l.show();
	    System.out.println("Enter the element to be deleted:");
	    //int in=sc.nextInt();
	  //  l.add(n);
	   // l.delNode(l);
	
	}
}
