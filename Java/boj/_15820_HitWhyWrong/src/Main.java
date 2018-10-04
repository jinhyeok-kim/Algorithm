import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sample = Integer.parseInt(st.nextToken());
        int system = Integer.parseInt(st.nextToken());

        int i = 0;
        for(i = 0; i < sample+system; i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());

            int answer = Integer.parseInt(st1.nextToken());
            int manyoung = Integer.parseInt(st1.nextToken());

            if(answer != manyoung){
                break;
            }
        }

        if(i == sample+system){
            System.out.println("Accepted");
        }else{
            if(i < sample){
                System.out.println("Wrong Answer");
            }else{
                System.out.println("Why Wrong!!!");
            }
        }

    }
}
