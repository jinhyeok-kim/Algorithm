import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String sentence = br.readLine();

        while(!sentence.equals("END")){
            char[] pw = sentence.toCharArray();

            for(int i = pw.length-1; i >= 0; i--){
                System.out.print(pw[i]);
            }
            System.out.println();

            sentence = br.readLine();
        }

    }
}
