import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int t = 0; t < T; t++){
            StringTokenizer st =new StringTokenizer(br.readLine());
            int[] array = new int[10];

            for(int a = 0; a < array.length; a++){
                array[a] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(array);

            System.out.println(array[7]);

        }

    }
}
