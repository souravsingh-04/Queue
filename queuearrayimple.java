public class queuearrayimple {
    public static class queueA{
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[5];
        public void add(int val){
            if(rear == arr.length-1){  // Check if queue is full or not
                System.out.println("Queue is full:");
                return;
            }
            if(front == -1){
                front = rear = 0; // they are at starting, make them to index 0
                arr[0] = val;
            }
            else{
                arr[rear+1] = val;  // rear+1 index pe hoga add
                rear++;
            }
            size++;
        }
        public int remove(){
            if(size == 0){
                System.out.println("Queue is empty");
                return -1;
            }
            front++;
            size--;
            return arr[front-1];
        }
        public int peek(){
            if(size == 0){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
        public void display(){
            if(size == 0){
                System.out.println("Queue is empty");
            }
            for(int i=front; i<=rear; i++){
                System.out.print(arr[i]+ " ");
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        queueA q = new queueA();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
    }
}
