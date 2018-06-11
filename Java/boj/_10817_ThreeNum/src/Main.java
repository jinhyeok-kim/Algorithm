import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        if(A>B){
            middle(A, B, C);
        }else if(B>=A) {
            middle(B, A, C);
        }


    }

    private static void middle(int a, int b, int c) {
        if(b > c){
            System.out.println(b);
        }
        else if(c > a){
            System.out.println(a);
        }
        else{
            System.out.println(c);
        }
    }
}
