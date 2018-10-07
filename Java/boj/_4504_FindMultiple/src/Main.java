import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int a = Integer.parseInt(br.readLine());

        while(a != 0){
            if(a%n == 0){
                System.out.println(a + " is a multiple of " + n + ".");
            }else{
                System.out.println(a + " is NOT a multiple of " + n + ".");
            }
            a = Integer.parseInt(br.readLine());
        }
    }
}
