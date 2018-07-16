import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int price = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        int coin = Integer.parseInt(st.nextToken());

        int answer = price*num-coin;
        if(answer>=0){
            System.out.println(answer);
        }else{
            System.out.println(0);
        }

    }
}
