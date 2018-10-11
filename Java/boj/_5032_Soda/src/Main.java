import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int i = (e+f)/c;
        int eb = (e+f)/c + (e+f)%c;


        while(true){
            if(eb >= c){
                i += eb/c;
                eb = eb/c + eb%c;
            }else{
                break;
            }

        }

        System.out.println(i);
    }
}
