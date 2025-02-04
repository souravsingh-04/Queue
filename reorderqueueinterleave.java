import java.util.*;
public class reorderqueueinterleave {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        System.out.println("Queue before: "+ q);
        Stack<Integer> st = new Stack<>();
        int n = q.size()/2;
        for(int i=0; i<n; i++){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        for(int i=0; i<n; i++){
            st.push(q.remove());
        }
        for(int i=0; i<n; i++){
            q.add(st.pop());
            q.add(q.remove());
            
        }
        //Now reverse the queue
        while(q.size()>0){
            st.push(q.remove());
        }
        while(st.size() > 0){
            q.add(st.pop());
        }
        System.out.println("Queue after: "+ q);
       
    }
}
