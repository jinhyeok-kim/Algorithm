import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int boy = -1;
        int girl = -1;

        while(boy != 0 && girl != 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            boy = Integer.parseInt(st.nextToken());
            girl = Integer.parseInt(st.nextToken());
            if(boy != 0 && girl != 0) {
                System.out.println(boy + girl);
            }
        }
    }
}
