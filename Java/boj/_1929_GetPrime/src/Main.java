import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        boolean[] num = new boolean[1000001];

        for(int i = 2; i <= 1000000; i++){
            num[i] = true;
        }

        for(int i = 2; i<= 1000000; i++){
            for(int j = 2; j <=1000000; j++){
                if((long)i*(long)j<=1000000) {
                    num[i * j] = false;
                }
            }
        }
        int first = Integer.parseInt(st.nextToken());
        int last = Integer.parseInt(st.nextToken());
        for(int i = first ; i <= last; i++){
            if(num[i]){
                System.out.println(i);
            }
        }
    }
}
