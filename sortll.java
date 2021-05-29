/*Write a java program to sort the elements of the singly linked list

Sample:
Input=
6
82 25 53 61 42 76
Output=
25 42 53 61 76 82

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
      
    //Write addNode() which will add a new node to the list
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
    
    public void sortList()
    {
        Node cur=head,index=null;
        int temp;
        if(head==null){
            return;
        }
        else{
            while(cur!=null){
                index=cur.next;
                
                while(index!=null){
                    if(cur.data>index.data)
                    {
                        temp=cur.data;
                        cur.data=index.data;
                        index.data=temp;
                    }
                    index=index.next;
                }
                cur=cur.next;
            }
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
    
    
    
    //write sortList() which will sort nodes of the list in ascending order  
    
      
    //write display() which will display all the nodes present in the list  
    
      
    public static void main(String[] args) 
	{  
        Scanner sc=new Scanner(System.in);  
        Test list = new Test();  
        int n=sc.nextInt();
		for(int i=0;i<n;i++)
			list.addNode(sc.nextInt());
        
        list.sortList();  
        list.display();  
    }  
} 

/*Test cases:
case=1
Input=6
82 25 53 61 42 76 32
Output=
25 32 42 53 61 76 82

case=2
Input=4
56 42 12 32
Output=
12 32 42 56
*/
