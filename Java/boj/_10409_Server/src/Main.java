import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        int complete = 0;
        int i = 0;

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        while(i < n){
            complete += Integer.parseInt(st1.nextToken());
            if(complete <= T){
                i++;
            }else{
                break;
            }
        }

        System.out.println(i);
    }
}
