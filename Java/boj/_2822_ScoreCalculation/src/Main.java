import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] participate = new int[8];
        int[] origin = new int[8];

        for(int i = 0; i < 8; i++){
            participate[i] = Integer.parseInt(br.readLine());
            origin[i] = participate[i];
        }



        Arrays.sort(participate);

        int sum = 0;

        for(int i = 0; i < 5; i++){
            sum += participate[7-i];
        }

        System.out.println(sum);

        for(int i = 0; i < origin.length; i++){
            if(origin[i] == participate[7] ||
                    origin[i] == participate[6] ||
                    origin[i] == participate[5] ||
                    origin[i] == participate[4] ||
                    origin[i] == participate[3]){
                System.out.print(i+1 + " ");
            }
        }


    }
}
