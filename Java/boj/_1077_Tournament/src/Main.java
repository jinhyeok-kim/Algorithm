import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if(A>B){
            int temp = A;
            A = B;
            B = temp;
        }
        int count = 1;

        while(true) {
            if (A % 2 == 1 && B == A + 1) {
                bw.write(count + "\n");
                break;
            }
            A = (int) Math.ceil(A/2 + A%2);
            B = (int) Math.ceil(B/2 + B%2);
            count++;
        }

        bw.flush();
        bw.close();

    }
}
