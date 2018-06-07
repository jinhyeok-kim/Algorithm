import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {

        //코드에 문제가 없는 것 같은데 계속 시간 초과가 떠서 굉장히 애먹은 문제이다.
        //시간초과는 스캐너를 쓰지 않고 버퍼리더와 라이터를 씀으로써 해결하였다.
        //으아아아아아아아

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long N = Long.parseLong(br.readLine());

        long[] numArray = new long[10001];

        for(long i = 0; i < N; i++){
            numArray[Integer.parseInt(br.readLine())]++;
        }

        br.close();

        for(int i = 0; i < 10001; i++){
            if(numArray[i] != 0) {
                for (long j = 0; j < numArray[i]; j++) {
                    bw.write(i+"\n");
                }
            }
        }
        bw.flush();
        bw.close();

    }
}
