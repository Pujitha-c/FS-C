/* Write a Java program to left rotate doubly linked list by N nodes

Sample 1:
Input=
5   \\Size of list
12 42 35 65 9   \\list elements
3   \\Number of rotations
Output=
65 9 12 42 35

Sample 2:
input=
4                                                                                                                       
1 2 3 4                                                                                                                 
5                                                                                                                       
output=
Rotation not possible                                                                                                   
1 2 3 4 

*/
import java.util.*;
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
class Solution
{
    Node head,tail=null;
    int size=0;
    
    public void addNode(int data)
    {
        Node node=new Node(data);
        
        if(head==null)
        {
            head=tail=node;
            tail.next=null;
            head.prev=null;
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
    
    public void rotate(int n)
    {
        Node cur=head;
        if(n==0 || n>=size){
            System.out.println("Rotation not possible");
            return;
        }
        else
        {
            for(int i=1;i<n;i++)
                cur=cur.next;
            tail.next=head;
            head=cur.next;
            head.prev=null;
            tail=cur;
            tail.next=null;
        }
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
    public static void main(String[] atgs)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution list=new Solution();
        for(int i=0;i<n;i++)
            list.addNode(sc.nextInt());
        int c=sc.nextInt();
        list.rotate(c);
        list.display();
    }
}
