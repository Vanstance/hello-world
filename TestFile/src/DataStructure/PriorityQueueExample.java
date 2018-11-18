package DataStructure;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args){
        Queue<Integer> q1 = new PriorityQueue<Integer>();

        q1.add(5);
        q1.add(333);
        q1.add(2);
        q1.add(1);

        while(!q1.isEmpty()){
            System.out.println(q1.poll()+",");
        }

        System.out.println();
    }
}
