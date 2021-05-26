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
    
    public boolean palindrome(ListNode head)
    {
        ListNode sp=head,fp=head,mid=null;
        while(fp!=null && fp.next!=null)
        {
            sp=sp.next;
            fp=fp.next.next;
        }
        if(fp!=null){
            mid=sp.next;
        }
        else{
            mid=sp;
        }
        
        ListNode prev=null,next=null;
        while(mid!=null)
        {
            next=mid.next;
            mid.next=prev;
            prev=mid;
            mid=next;
        }
        while(prev!=null)
        {
            while(prev.data!=head.data)
            {
               return false;
            }
            prev=prev.next;
            head=head.next;
            
        }
        return true;
    }
}
public class Main
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
		boolean res;
		res=l.palindrome(head);
		if(res==false)
		System.out.println("no");
		else 
		System.out.println("palindrome");
		
	}
}
