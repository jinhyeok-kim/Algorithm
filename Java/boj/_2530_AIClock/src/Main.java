import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());

        second += Integer.parseInt(br.readLine());
        minute += second/60;
        second %= 60;

        hour += minute/60;
        minute %= 60;

        hour %= 24;

        System.out.println(hour + " " + minute + " " + second);



    }
}
