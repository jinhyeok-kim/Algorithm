import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        LinkedList<Integer> ll = new LinkedList<>();


       for(int i = 1; i <= N; i++){
           ll.add(i);
       }

       int count = M - 1;
        System.out.print("<");
       while(true){

           if(ll.size() == 1){
               System.out.print(ll.get(count));
           }else {
               System.out.print(ll.get(count) + ", ");
           }
           ll.remove(count);
           if(ll.isEmpty()){
               break;
           }

           count +=  M - 1;
           count = count %ll.size();

       }

        System.out.println(">");

    }
}
