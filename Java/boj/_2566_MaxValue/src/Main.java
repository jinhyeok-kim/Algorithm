import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int a =0;
        int b =0;
        for(int i = 1; i <= 9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int j = 1;
            while(st.hasMoreTokens()){
                int value = Integer.parseInt(st.nextToken());
                if(value > max){
                    max = value;
                    a = i;
                    b = j;
                }
                j++;
            }
        }

        System.out.println(max);
        System.out.println(a + " "+ b);
    }
}
