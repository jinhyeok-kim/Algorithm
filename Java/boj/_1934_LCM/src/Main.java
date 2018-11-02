import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int t = 0; t < T; t++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int tmp1 = A;
            int tmp2 = B;
            if(A<B){
                int temp = A;
                A = B;
                B = temp;
            }
            int r = 1;

            while(r>0){
                r = A % B;
                A = B;
                B = r;
            }
            System.out.println(tmp1*tmp2/A);


        }

    }
}
