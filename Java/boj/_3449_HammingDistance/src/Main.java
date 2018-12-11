import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int t = 0; t < T; t++){
            char[] first = br.readLine().toCharArray();
            char[] second = br.readLine().toCharArray();

            int count = 0;

            for(int i = 0; i < first.length; i++){
                if(first[i] != second[i]){
                    count++;
                }
            }

            System.out.println("Hamming distance is " + count + ".");
        }
    }
}
