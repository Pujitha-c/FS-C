import java.util.*;
class RAM implements Comparable<RAM> {
   // declare id,price of type integer
   int id,price;
   // declare store and brand of type string
   String store,brand;
   
    public int compareTo(RAM ram) {
        return this.price - ram.price;
    }
    public RAM(String store, int id , String brand, int price) {
       //intialize the values
       this.store=store;
       this.id=id;
       this.brand=brand;
       this.price=price;
    }
    public String getStore() {
      //return store value
      return store;
    }
    public String getBrand() {
 //return brand value
 return brand;
    }
    public int getPrice() {
      //return price vlaue
      return price;
    }
    public int getid(){
        //return id value
        return id;
    }
}
class RAMDetails {
    public static void main(String[] args) {
        ArrayList<RAM> list = new ArrayList<RAM>();
        list.add(new RAM("Store 1", 1507, "Micron",  3000));
        list.add(new RAM("Store 2", 1609,"Kingston" , 2300));
        list.add(new RAM("Store 3", 1200, "Hynix", 2700));
        list.add(new RAM("Store 4", 6098, "OCZ", 2800));
      //call the collection and sort
      Collections.sort(list);
        System.out.println("After sorting prices : ");
        Iterator itr=list.iterator();
        while(itr.hasNext())
        {
            RAM ram=(RAM)itr.next();
            System.out.println(ram.store+" "+ram.id+" "+ram.brand+" "+ram.price);
        }
        
        
    }
}
