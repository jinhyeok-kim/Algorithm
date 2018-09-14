import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        // a:97 z:122
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alpha = new int[26];

        String line;
        while(true){

            if((line = br.readLine()) == ""){
                break;
            }
            for(int i =0 ; i < line.length(); i++){
                if((int)line.charAt(i) >= 97 && (int)line.charAt(i) <= 122 ){
                    alpha[line.charAt(i)-97]++;
                }

            }
        }
        br.close();

        int max = 0;
        for(int i =0 ; i< alpha.length;i++){
            if(alpha[i]>max){
                max = alpha[i];
            }
        }

        for(int i =0 ; i< alpha.length;i++){
            if(alpha[i] == max){
                int temp = i + 97;
                System.out.print((char)temp);
            }
        }

    }
}
