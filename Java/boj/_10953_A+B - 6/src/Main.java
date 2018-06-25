import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int t = 0; t < T; t++){
            String num = br.readLine();
            String[] nums= num.split(",");

            int A = Integer.parseInt(nums[0]);
            int B = Integer.parseInt(nums[1]);
            System.out.println(A+B);
        }
    }
}
