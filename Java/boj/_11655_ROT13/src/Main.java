import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] sentence = br.readLine().toCharArray();

        for(int s = 0; s < sentence.length; s++){
            int pw = sentence[s];
            if(sentence[s] >= 97 && 122 >= sentence[s]){
                for(int i = 0; i < 13; i++){
                    if(pw == 122){
                        pw = 97;
                    }else{
                        pw++;
                    }
                }
            }else if(sentence[s] >= 65 && 90 >= sentence[s]){
                for(int i = 0; i < 13; i++){
                    if(pw == 90){
                        pw = 65;
                    }else{
                        pw++;
                    }
                }
            }
            System.out.print((char)pw);
        }



    }
}
