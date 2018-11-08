import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());
        int[] num = new int[K];
        int point = 0;

        for(int k = 0; k < K; k++){
            num[point] = Integer.parseInt(br.readLine());

            if(num[point] == 0){
                num[--point] = 0;
            }else{
                point++;
            }
        }

        int sum =0;

        for(int i =0 ; i < num.length; i++){
            sum += num[i];
        }

        System.out.println(sum);


    }
}
