import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //+ : 43 - : 45 * : 42 / : 47 = : 61


        String line = "";
        int result = Integer.parseInt(br.readLine());

        while(!line.equals("=")){


            if(line.equals("+")){
                result = result + Integer.parseInt(br.readLine());
            }
            else if(line.equals("-")){
                result = result - Integer.parseInt(br.readLine());
            }
            else if(line.equals("*")){
                result = result * Integer.parseInt(br.readLine());
            }
            else if(line.equals("/")){
                result = result / Integer.parseInt(br.readLine());
            }

            line = br.readLine();
        }

        System.out.println(result);
    }
}
