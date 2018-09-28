import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int i = 0;
        int before = -1000001;
        int current = 0;

        int length = st.countTokens();

        while(st.hasMoreTokens()){

            current = Integer.parseInt(st.nextToken());

            if(before > current){
                break;
            }
            before = current;
            i++;
        }



        if(i == length){
            System.out.println("Good");
        }else{
            System.out.println("Bad");
        }

    }
}
