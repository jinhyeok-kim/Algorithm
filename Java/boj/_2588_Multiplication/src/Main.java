import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int first = Integer.parseInt(br.readLine());

        int next = Integer.parseInt(br.readLine());

        int[] second = new int[3];

        second[2] = next%10;
        second[1] = (next % 100)/10;
        second[0] = next/100;


        System.out.println(first*second[2]);
        System.out.println(first*second[1]);
        System.out.println(first*second[0]);
        System.out.println(first* next);

    }
}
