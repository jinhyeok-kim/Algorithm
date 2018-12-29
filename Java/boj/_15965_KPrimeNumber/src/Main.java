import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        boolean[] num = new boolean[10001];

        for(int i = 2; i <= 10000; i++){
            num[i] = true;
        }

        for(int i = 2; i<= 10000; i++){
            for(int j = 2; j <=10000; j++){
                if(i*j<=10000) {
                    num[i * j] = false;
                }
            }
        }
        int count = 0;
        int i = 0;
        while(i < N){
            if(num[count]){
                i++;
            }
            count++;
        }

        System.out.println(count-1);

    }
}
