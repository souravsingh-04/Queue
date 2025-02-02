import java.util.*;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
       dq.addLast(1);
       dq.addLast(2);
       dq.addLast(3);
       System.out.println(dq);  // 1  2  3
       dq.addFirst(10);       // 10 1 2 3
       System.out.println(dq);
       dq.addFirst(20);       // 20 10 1 2 3
       System.out.println(dq);
       dq.removeLast();   // 20 10 1 2
       System.out.println(dq);
       dq.removeFirst();  // 10 1 2
       System.out.println(dq);
       System.out.println(dq.getFirst()); //10
       System.out.println(dq.getLast());  // 2
    }
}
