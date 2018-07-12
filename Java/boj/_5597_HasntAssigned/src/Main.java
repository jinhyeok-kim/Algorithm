import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] studuent = new int[31];

        for (int i = 0; i < 28; i++) {
            studuent[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 1; i < 31; i++) {
            if (studuent[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
