package videos.ITVDN.JavaProfessionalRenewed.lesson2.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QMain {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>(2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        q.offer(7);
        q.offer(9);
        System.out.println(q);
        q.offer(10);
        q.offer(11);
        System.out.println(q);

        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q);

    }
}
