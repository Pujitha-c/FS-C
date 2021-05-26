/*Write a java program to remove duplicate elements from a singly linked list

Sample:
input=
6   \\size                                                                                                                       
1 2 3 1 2 4     \\list elements                                                                                                            
output=
Original list:                                                                                                          
1 2 3 1 2 4                                                                                                             
List after removing duplicates:                                                                                         
1 2 3 4 

*/
import java.util.*;
class ListNode
{
    ListNode head;
    int data;
    ListNode next;
  /*  ListNode(int val)
    {
        data=val;
    }*/
}
class LinkedList{
    ListNode head;
    public void add(int data)
    {
        ListNode node=new ListNode();
        node.data=data;
        node.next=null;
        if(head==null)
        {
            head=node;
        }
        else{
            ListNode n=head;
            while(n.next!=null)
            {
                n=n.next;
            }
            n.next=node;
        }
    }
    public void remEle()
    {
        ListNode p1=null,p2=null,dup=null;
        p1=head;
        while(p1!=null && p1.next!=null)
        {
            p2=p1;
            while(p2.next!=null)
            {
                if(p1.data==p2.data)
                {
                    dup=p2.next;
                    p2.next=p2.next.next;
                }
                else{
                    p2=p2.next;
                }
            }
            p1=p1.next;
        }
    }
    
  /*  void printList() {
        ListNode node=head;
        while (node.next != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println(node.data);
    }   */ 
    void show(ListNode node)
    {
        node=head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
public class Test
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList l=new LinkedList();
		ListNode head=null;
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    int s=sc.nextInt();
		    l.add(s);
		}
		System.out.println("original list");
		l.show(head);
		System.out.println();
		l.remEle();
		System.out.println("after removal");
		l.show(head);
		
	}
}
