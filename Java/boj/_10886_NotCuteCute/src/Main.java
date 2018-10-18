import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cute = 0;
        int notcute = 0;

        for(int n = 0; n < N; n++){
            int person = Integer.parseInt(br.readLine());
            if(person == 0){
                notcute++;
            }else{
                cute++;
            }
        }

        if(cute > notcute){
            System.out.println("Junhee is cute!");
        }else{
            System.out.println("Junhee is not cute!");
        }
    }
}
