import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        while(N != 0){
            char[] sentence = br.readLine().toCharArray();
            char[][]answer = new char[sentence.length/N][N];

            int count = 0;
            int j = 0;
            while(count != sentence.length){
                if(j%2 == 0) {
                    for (int i = 0; i < N; i++) {
                        answer[j][i] = sentence[count];
                        count++;
                    }
                    j++;
                }else {
                    for (int i = N - 1; i >= 0; i--) {
                        answer[j][i] = sentence[count];
                        count++;
                    }
                    j++;
                }
            }
            for(int i = 0; i < N; i++){
            for(int w = 0; w < sentence.length/N; w++){
                System.out.print(answer[w][i]);
            }
        }

            System.out.println();

        N = Integer.parseInt(br.readLine());
    }
    }
}
