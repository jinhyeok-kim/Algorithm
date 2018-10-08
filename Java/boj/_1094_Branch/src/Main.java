import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int stick = 64;
        int i =0;

        while(X != 0) {
            while (stick > X) {
                stick = stick / 2;
            }
            i++;
            X = X - stick;
        }

        System.out.println(i);

    }
}
