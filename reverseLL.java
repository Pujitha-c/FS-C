/*Given a linked list of N nodes. The task is to reverse this list.

Example 1:

Input:
LinkedList: 1->2->3->4->5->6
Output: 6 5 4 3 2 1
Explanation: After reversing the list, 
elements are 6->5->4->3->2->1.
Example 2:

Input:
LinkedList: 2->7->8->9->10
Output: 10 9 8 7 2
Explanation: After reversing the list,
elements are 10->9->8->7->2.
Your Task:
The task is to complete the function reverseList() with head reference as the only argument and should return new head after reversing the list.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= N <= 104

*/
import java.util.Scanner;
class Node
{  
	int data;  
	Node next;  
	public Node(int data) 
	{  
		this.data = data;  
		this.next = null;  
	}  
} 
public class Test
{  
    public Node head = null;  
    public Node tail = null;  
      
    public void addNode(int data)
    {
        Node node=new Node(data);
        if(head==null)
        {
            head=node;
            tail=node;
        }
        else
        {
            tail.next=node;
            tail=node;
        }
    }
    
    public void reverseList(Node cur)
    {
        if(head==null){
            return;
        }
        else{
            if(cur.next==null)
            {
                System.out.println(cur.data+" ");
                return;
            }
            reverseList(cur.next);
            System.out.println(cur.data+" ");
        }
    }
    public void display()
    {
        Node cur=head;
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
            while(cur!=null)
            {
                System.out.println(cur.data+" ");
                cur=cur.next;
            }
            System.out.println();
        
    }
    
    public static void main(String[] args) 
	{  
        Scanner sc=new Scanner(System.in);  
        Test list = new Test();  
        int n=sc.nextInt();
		for(int i=0;i<n;i++)
			list.addNode(sc.nextInt());
        System.out.println("Original list");
        list.display();
        System.out.println("After reversal");
        list.reverseList(list.head);  
          
    }  
} 
