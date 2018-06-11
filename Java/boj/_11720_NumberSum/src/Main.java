import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String n = br.readLine();

        char[] num = n.toCharArray();


        long sum = 0;
        for(int i = 0; i < num.length; i++){
            sum += Integer.parseInt(String.valueOf(num[i]));
        }

        System.out.println(sum);


    }
}
