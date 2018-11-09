import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<Integer>();

        Queue<Integer> queue = new LinkedList<>();


//        for(int n = N; n > 0; n--){
//            stack.push(n);
//        }

        for(int n = 1; n <= N; n++){
            ((LinkedList<Integer>) queue).addLast(n);
        }

        while(queue.size() != 1){
            queue.poll();
            ((LinkedList<Integer>) queue).addLast(queue.poll());
        }

        System.out.println(queue.poll());

//        while(stack.size() != 1){
//            stack.pop();
//            stack.add(0, stack.pop());
//        }
//
//        System.out.println(stack.pop());

    }
}
