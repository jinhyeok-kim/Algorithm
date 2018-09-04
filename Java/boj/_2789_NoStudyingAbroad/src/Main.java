import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] mail = br.readLine().toCharArray();

        for(int i = 0; i < mail.length; i++){
            if(mail[i] != 'C' && mail[i] != 'A' && mail[i] != 'M' &&
                    mail[i] != 'B' && mail[i] != 'R' && mail[i] != 'I' &&
                    mail[i] != 'D' && mail[i] != 'G' && mail[i] != 'E'){
                System.out.print(mail[i]);
            }
        }
    }
}
