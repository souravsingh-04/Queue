public class circularqueuearray {
    public static class circularqueue{
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[5];
        public void add(int val){
            if(size == arr.length){
                System.out.println("Queue is full");
            }
            else if(size == 0){
                front = rear = 0;
                arr[0] = val;
            }
            else if(rear < arr.length-1){  // normal case when rear is less than array length
                arr[++rear] = val;   // phele rear ko aage lao, then arr[rear] = val kro;

            }
            else if(rear == arr.length-1){
                rear = 0;
                arr[0] = val;

            }
            size++;
        }
        public int remove() {
            if(size == 0 ) {
                System.out.println("QUeue is empty");
                return -1;
            }
            else{
                int data = arr[front];
                if(front == arr.length-1){
                    front = 0;
                }
                else{
                    front++;
                }
                size--;
                return data;              
            }
        }
        public int peek() {
            if(size == 0){
                System.out.println("Queue is empty");
                return -1;
            }
            else return arr[front];
        }
        public void display(){
            if(size == 0){
                System.out.println("Queue is empty");
            }
            else if(front<rear){
                for(int i=front; i<arr.length; i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
            else if(rear< front){
                for(int i=front; i<arr.length; i++){
                    System.out.print(arr[i] + " ");
                }
                for(int i=0; i<rear; i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        circularqueue q = new circularqueue();
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
