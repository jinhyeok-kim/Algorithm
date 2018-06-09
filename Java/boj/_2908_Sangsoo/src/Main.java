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

        A = reverse(A);
        B = reverse(B);
        if(A> B){
            System.out.println(A);
        }
        else{
            System.out.println(B);
        }
    }

    static int reverse(int num){
        int newNum = 0;

        while(num != 0){
            newNum *= 10;
            newNum += (num%10);
            num = num/10;
        }

        return newNum;
    }
}
