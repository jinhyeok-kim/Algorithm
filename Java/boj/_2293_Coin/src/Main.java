import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] coin = new int[n];
        int[] money = new int[k+1];

        for(int i = 0; i < n; i++){
            coin[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < n; i++){
            if(coin[i] <= k){
                money[coin[i]]++;
                for(int j = coin[i] + 1; j < money.length; j++){
                    money[j] += money[j - coin[i]];
                }
            }
        }

        bw.write(money[k] + "\n");
        bw.flush();
        bw.close();


    }
}
