import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        int number = 0;
        for(int i = 0; i < 5; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int point = 0;
            for(int j = 0; j < 4; j++){
                point += Integer.parseInt(st.nextToken());
            }
            if(point > answer){
                number = i + 1;
                answer = point;
            }

        }

        System.out.println(number + " " + answer);
    }
}
