import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] bowl = br.readLine().toCharArray();

        int count = 10;
        for(int i = 1; i < bowl.length; i++){
            if(bowl[i-1] == bowl[i]){
                count += 5;
            }else{
                count += 10;
            }

        }
        System.out.println(count);

    }
}
