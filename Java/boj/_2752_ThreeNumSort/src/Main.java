import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] sort = new int[st.countTokens()];

        int i = 0;
        while (st.hasMoreElements()){
            sort[i++] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sort);

        for(int j = 0; j <sort.length;j++) {
            System.out.print(sort[j] + " ");
        }
        }
}
