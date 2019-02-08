import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());


        for(int t = 0; t < T; t++){
            char[] parenthesis = br.readLine().toCharArray();
            Stack<Character> stack = new Stack<Character>();

            for (char i : parenthesis) {
                if(i == '('){
                    stack.push(i);
                }
                else if(i == ')'){
                    if(stack.isEmpty()){
                        stack.push(i);
                    }else if(stack.peek() == '('){
                        stack.pop();
                    }
                }
            }

            if(stack.isEmpty()){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }

    }
}
