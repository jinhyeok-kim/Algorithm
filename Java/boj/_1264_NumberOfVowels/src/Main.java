import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String sentece;
        while(!(sentece = br.readLine()).equals("#")){
            char[] sen = sentece.toCharArray();

            int count = 0;

            for(int i =0 ; i < sen.length;i++){
                if(sen[i] == 'a' || sen[i] == 'e' || sen[i] == 'i' || sen[i] == 'o' ||sen[i] == 'u' ||
                sen[i] == 'A' || sen[i] == 'E' || sen[i] == 'I' || sen[i] == 'O' ||sen[i] == 'U'){
                    count++;
                }
            }

            System.out.println(count);

        }

    }
}
