/*Given N integers, store them in a doubly linked list. 
Write a Java program to delete an element from beginning, middle and end of 
the doubly linked list.

Example:
Input=
6    \\size                                                                                                                   
52 48 15 32 61 26       \\elements              
Output=
Doubly Linked List: 52 48 15 32 61 26                                                                                   
List after deleting first element: 48 15 32 61 26                                                                       
List after deleting last element: 48 15 32 61                                                                           
List after deleting middle element: 48 32 61                                                                            

*/
import java.util.Scanner;
class Node
{
    int data;
    Node next;
    Node prev;
    public Node(int data)
    {
        this.data=data;
    }
}
public class Solution
{
    Node head, tail=null;
    int size=0;
    
    public void addNode(int data)
    {
        Node node=new Node(data);
        if(head==null)
        {
            head=tail=node;
            head.prev=null;
            tail.next=null;
        }
        else
        {
            tail.next=node;
            node.prev=tail;
            tail=node;
            tail.next=null;
        }
        size++;
    }
    public void delFirst()
    {
        if(head==null)
        {
            return;
        }
        else{
            if(head!=tail)
            {
                head=head.next;
                head.prev=null;
            }
            else
            {
                head=tail=null;
            }
        }
        size--;
    }
    public void delLast()
    {
        if(head==null){
            return;
        }
        else
        {
            if(head!=null)
            {
            tail=tail.prev;
            tail.next=null;
        }
        else
        {
            head=tail=null;
        }
        }
        size--;
    }
    public void delMid()
    {
        if(head==null)
        {
            return;
        }
        else{
            Node cur=head;
            int mid=(size%2==0)?(size/2):((size+1)/2);
            for(int i=1;i<mid;i++)
            {
                cur=cur.next;
            }
            if(cur==head)
            {
                head=cur.next;
            }
            else if(tail==head)
            {
                tail=tail.prev;
            }else{
                cur.prev.next=cur.next;
                cur.next.prev=cur.prev;
            }
            cur=null;
        }
        size--;
    }
    public void display()
    {
        Node cur=head;
        if(head==null)
        {
            System.out.println("empty list");
        }
        while(cur!=null)
        {
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    
    
    
    public static void main(String[] ars)
    {
        Scanner sc=new Scanner(System.in);
        Solution list=new Solution();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
            list.addNode(sc.nextInt());
        System.out.print("Doubly Linked List: ");
        list.display();
      //  while(list.head!=null){
        System.out.print("List after deleting first element: ");
        list.delFirst();
        list.display();
        System.out.print("List after deleting last element: ");
        list.delLast();
        list.display();
        System.out.print("List after deleting middle element: ");
            list.delMid();
            list.display();
        //}    
    
    }
}
