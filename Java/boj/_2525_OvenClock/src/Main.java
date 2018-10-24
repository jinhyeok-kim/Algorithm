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

        int time = Integer.parseInt(br.readLine());

        minute += time;

        int temp = minute/60;

        minute = minute - temp*60;

        hour += temp;

        if(hour >= 24){
            hour -= 24;
        }

        System.out.println(hour + " " +minute);




    }
}
