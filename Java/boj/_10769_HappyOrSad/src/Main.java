import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] sentence = br.readLine().toCharArray();


        int happy = 0;
        int sad = 0;

        for(int i = 0; i < sentence.length; i++){
            if(sentence[i] == 58){
                if(sentence[i+1] == 45 && sentence[i+1] != sentence.length){
                    if(sentence[i+2] == 40 && sentence[i+2] != sentence.length){
                        sad++;
                    }else if(sentence[i+2] == 41 && sentence[i+2] != sentence.length){
                        happy++;
                    }
                }
            }
        }

        if(happy == 0 && sad == 0){
            System.out.println("none");
        }
        else if(happy > sad){
            System.out.println("happy");
        }else if(happy == sad){
            System.out.println("unsure");
        }else if(happy < sad){
            System.out.println("sad");
        }

    }
}
