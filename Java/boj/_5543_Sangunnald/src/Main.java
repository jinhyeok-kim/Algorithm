import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nald = new int[5];

        for (int i = 0; i < 5; i++) {
            nald[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(min(nald[0],nald[1],nald[2]) + min(nald[3],nald[4]) - 50);
    }

    static int min(int a, int b, int c) {
        int temp;
        temp = (a<b)? a: b;
        return c < temp? c: temp;
    }

    static int min(int a, int b) {

        if (a > b) {
            return b;
        } else {
            return a;
        }
    }
}