import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] oddNum = new int[7];
        int sum = 0;
        for(int i = 0; i < 7; i++){
            int num = Integer.parseInt(br.readLine());
            if(num%2 == 1){
                oddNum[i] = num;
                sum += oddNum[i];
            }
        }

        Arrays.sort(oddNum);

        int j = 0;
        for(j = 0; j < 7;j++){
            if(oddNum[j] != 0){
                break;
            }
        }


        if(j == 7){
            System.out.println(-1);
        }else {
            System.out.println(sum);
            System.out.println(oddNum[j]);
        }

    }
}
