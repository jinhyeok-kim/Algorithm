
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        CircularQueue cq = new CircularQueue(N);

        st = new StringTokenizer(br.readLine());

        for(int i =0 ; i < M; i++){
            cq.operate(Integer.parseInt(st.nextToken()));
        }

        System.out.println(cq.count());
    }

    private static class CircularQueue {
        LinkedList<Integer> list = new LinkedList<>();
        int count = 0;

        public CircularQueue(int n){
            for(int i = 1; i <= n; i++){
                list.add(i);
            }
        }
        public void operate(int i) {
            while(true) {
                int num_index = list.indexOf(i);
                if (num_index == 0) {
                    list.poll();
                    break;
                } else {
                    if (num_index < list.size() - num_index) {
                        list.addLast(list.pollFirst());
                        count++;
                    } else {
                        list.addFirst(list.pollLast());
                        count++;
                    }

                }
            }
        }

        public int count() {
            return count;
        }
    }
}
