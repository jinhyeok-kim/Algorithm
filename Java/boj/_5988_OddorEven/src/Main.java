import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            char[] num = br.readLine().toCharArray();

            if(num[num.length-1]%2 == 1){
                System.out.println("odd");
            }else{
                System.out.println("even");
            }
        }

    }
}
