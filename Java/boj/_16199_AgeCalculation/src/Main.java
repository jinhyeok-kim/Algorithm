import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer birth = new StringTokenizer(br.readLine());

        int year = Integer.parseInt(birth.nextToken());
        int month = Integer.parseInt(birth.nextToken());
        int day = Integer.parseInt(birth.nextToken());

        StringTokenizer standard = new StringTokenizer(br.readLine());

        int s_year = Integer.parseInt(standard.nextToken());
        int yearAge = s_year - year;

        if(year < s_year) {
            if (month <= Integer.parseInt(standard.nextToken())) {
                if (day <= Integer.parseInt(standard.nextToken())) {
                    System.out.println(yearAge);
                } else {
                    System.out.println(yearAge - 1);
                }
            } else {
                System.out.println(yearAge-1);
            }
        }else{
            System.out.println(yearAge);
        }

        System.out.println(yearAge + 1);

        System.out.println(yearAge);







    }
}
