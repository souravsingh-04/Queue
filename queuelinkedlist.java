public class queuelinkedlist {
    public static class Node{  // User defined data type
        int val;
        Node next;
        Node(int val){  // Constructor
            this.val = val;
        }
    }
    public static class queueLL{  // User defined data structure
         Node head = null;
         Node tail = null;
         int size = 0;
         public void add(int val){ // add function for queue
            Node temp = new Node(val);
            if(size == 0){ 
                head = tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
         }
         public int peek(){  // peek function for queue
            if(size == 0 ){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.val;
         }
         public int remove(){  // remove function for queue
            if(size == 0 ){
                System.out.println("Queue is empty");
                return -1;
            }
            int data = head.val;
            head = head.next;
            size--;
            return data;
         }
         public void display(){  // display function for queue
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }System.out.println();
         }
    }
    public static void main(String[] args) {
        queueLL q = new queueLL();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.peek());
        q.display();
        q.remove();
        q.display();
        
    }
}
