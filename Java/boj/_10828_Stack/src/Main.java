import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Stack mStack = new Stack();

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if(command.equals("push")){
                mStack.push(st.nextToken());
            }
            else if(command.equals("top")){
                if(mStack.empty()){
                    System.out.println(-1);
                }else{
                    System.out.println(mStack.peek());
                }
            }
            else if(command.equals("size")){
                System.out.println(mStack.size());
            }
            else if(command.equals("empty")){
                if(mStack.empty()){
                    System.out.println(1);
                }
                else{
                    System.out.println(0);
                }
            }
            else if(command.equals("pop")){
                if(mStack.empty()){
                    System.out.println(-1);
                }else{
                    System.out.println(mStack.pop());
                }
            }
        }


    }
}
