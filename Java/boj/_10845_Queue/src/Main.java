import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<Integer>();
        int N = Integer.parseInt(br.readLine());
        int x ;
        int last = 0;


        for(int i = 0; i < N; i++){
            String st = br.readLine();
            String instruction[] = st.split(" ");

            switch (instruction[0]){
                case "pop":
                    if(q.isEmpty()){
                        System.out.println("-1");
                    }else{
                        System.out.println(q.poll());
                    }
                    break;

                case "push":
                    x = Integer.parseInt(instruction[1]);
                    last = x;
                    q.offer(x);
                    break;

                case "size":
                    System.out.println(q.size());
                    break;

                case "empty":
                    if(q.isEmpty()){
                        System.out.println("1");
                    }else{
                        System.out.println("0");
                    }
                    break;

                case "front":
                    if(q.isEmpty()){
                        System.out.println(-1);
                    }else{
                        System.out.println(q.peek());
                    }
                    break;

                case "back":
                    if(q.isEmpty()){
                        System.out.println(-1);
                    }else{
                        System.out.println(last);
                    }
                    break;
            }
        }

    }
}
