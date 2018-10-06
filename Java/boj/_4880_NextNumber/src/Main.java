import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());
        int third = Integer.parseInt(st.nextToken());

        while(first != 0 || second != 0 || third != 0){

            if(second-first == third-second){
                int next = second-first;
                System.out.println("AP " + (third+next));
            }else if(second/first == third/second){
                int next = second/first;
                System.out.println("GP " + (third*next));
            }

            st = new StringTokenizer(br.readLine());

            first = Integer.parseInt(st.nextToken());
            second = Integer.parseInt(st.nextToken());
            third = Integer.parseInt(st.nextToken());
        }
    }
}
