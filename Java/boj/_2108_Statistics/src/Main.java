import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] num = new int[N];
        int[] range = new int[8010];
        int sum = 0;

        for(int n = 0; n < num.length; n++){
            num[n] = Integer.parseInt(br.readLine());
            range[num[n]+4000]++;
            sum += num[n];
        }

        double average = (double)sum/(double)N;

        System.out.println(Math.round(average));

        Arrays.sort(num);

        System.out.println(num[N/2]);

        int max = 0;
        int count = 0;
        for(int i = 0; i < range.length; i++){
            if(range[i] > max ){
                max = range[i];
            }
        }
        int rangeValue = 0;
        for(int i = 0; i < range.length; i++){
            if(range[i] == max ){
                if (count == 1) {
                    rangeValue = i;
                    break;
                }else{
                    rangeValue = i;
                    count++;
                }
            }
        }

        System.out.println(rangeValue-4000);

        System.out.println( num[N-1] - num[0]);





    }
}
