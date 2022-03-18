
public class StdLst
{
      private Node list;// head
    private Node location;
    private Node predloc;
    
    void CreateList(){


        list = null;
    }
    
    void DestroyList(){

        list = null;
    }
    
    boolean isEmpty(){


        if(list==null) 
            return true;
        else
            return false;
    }

    void Findstd(int key) {

        location = list;
        predloc = null;
        while(location != null){
            if (location.wrgno == key) break;
            else
                if(location.wrgno> key) location = null;
                else {
                    predloc = location;
                    location = location.next;
                }
        }
    }
      void DeleteElement(int key){


        FindElement(key);
        if(location == null)
            System.out.println("This Element Is Not Found");
        else {
            if(predloc == null)
                list=location.next;
            else
                predloc.next = location.next;
        }
    }
    
    void InsertElement(int key, String name, int wrgno){  


        Node ptr;//temp
        Findstd(key);
        if(location != null) 
            System.out.println("This Element Is Found");
        else{
            ptr = new Node();
            ptr.id = key;
            ptr.name = name;
            ptr.wrgno = wrgno;
            System.out.println("Added Successfully!");
            if (predloc == null){
                ptr.next = list;
                list = ptr;
            }
            else{
                ptr.next = predloc.next;
                predloc.next = ptr;
            }
        }
    }
    
    
    void PrintList(){


        Node ptr = list;
        while(ptr != null){
            System.out.println(ptr.id + "\t" + ptr.name + "\t" + ptr.wrgno);
            ptr = ptr.next;
        }
    }
    
  public  void Deletestd(int id,int key){
     Node ptr=list;
    Findstd(key);
    while(!StdLst=isEmpty){
     if(p.key>=3)
     Node.deleteElement();
      ptr=ptr.next;
    StdLst. PrintList();
    
        
           
}
}
  
    
    
}
