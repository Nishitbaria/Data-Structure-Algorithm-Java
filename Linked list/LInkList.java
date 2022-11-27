public class LInkList {
    public static void main(String[] args)  {     //main Funcation
       Node n1=new Node(10);   
       Node n2=new Node(20);
       Node n3=new Node(30);
       Node head = n1;
       head.next = n2;
       n2.next = n3;
       n3.next = null;
       System.out.println("Sab kucha badiya he");
    insert(4, head, 2);
    Travvels(head);
    }
     public static void  Travvels(Node head){
           Node current = head;
           while(current != null){
               System.out.print(current.data+" ");
               current = current.next;
           }
          System.out.println(" "); 
       }
       public static void insert(int data,Node head,int pos){
        Node toadd = new Node(data);
        if(pos == 0){
            toadd.next = head ;
            head = toadd;
            return;
        }
            Node prev = head;
            for(int i=0;i<pos-1;i++){
                prev = prev.next;
            }
            toadd.next = prev.next;
            prev.next = toadd;
       }
   public static void delete(Node head,int pos){
    if(pos == 0){
        head = head.next;
    }
    Node prev = head;
    for(int i=0;i<pos-1;i++){
        prev = prev.next;
    }
    prev = prev.next.next;
   }
   /*  Creatig Node classs  */ 
    }
        class Node{     //Constructer
       int data;
       Node next;
     Node(int data)  {
     this.data=data;
                     }
    }