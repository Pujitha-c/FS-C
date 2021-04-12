import java.util.*;
class Fine  implements Comparable<Fine>{  
  //declare carno and name of both string types
  String carno,name;
 //declare fine of integer type 
 int fine;
  Fine(String carno,String name,int fine){  
   //intialize values
   this.carno=carno;
   this.name=name;
   this.fine=fine;
  }  

public int compareTo(Fine f ){  
//write logic for sorting fine 
if(fine==f.fine)
return 0;
else if(fine>f.fine)
return 1;
else
return -1;
}  
}

 class Test{  
 public static void main(String args[]){  
  //Creating user-defined class objects 
  
Fine s1=new Fine("apdxv3","anil",3000);  
Fine s2=new Fine("ap39uhk","surya",1500);  
Fine s3=new Fine("mh39uhk","keerthi",4000); 
 
  //creating arraylist  
  ArrayList<Fine> al=new ArrayList<Fine>();  
  //adding test class object  
  al.add(s1);
  al.add(s2);
  al.add(s3);
   
   
  //print before sorting
  System.out.println("Elements After Sorting");
  //call sort function
  Collections.sort(al);
  //Getting Iterator  
  Iterator itr=al.iterator();
  //traversing elements of ArrayList object  
  while(itr.hasNext())
  {
      Fine f=(Fine)itr.next();
      System.out.println(f.carno+" "+ f.name+" "+ f.fine);
  }
  
 }  
}  
