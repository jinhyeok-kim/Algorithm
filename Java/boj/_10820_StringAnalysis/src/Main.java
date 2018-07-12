import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        //a: 97 z: 122
        //A: 65 Z: 90
        //0: 48 9: 57

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String sentence;
        while((sentence = br.readLine())!= null && sentence.length()!=0){

            if(sentence.equals("")){
                break;
            }else{
                char[] word = sentence.toCharArray();
                int capital = 0;
                int small = 0;
                int space = 0;
                int num = 0;

                for(int i =0; i < word.length; i++){
                    if(word[i] >= 97 && word[i] <= 122){
                        small++;
                    }
                    else if(word[i] >= 65 && word[i] <= 90){
                        capital++;
                    }
                    else if(word[i] >= 48 && word[i] <= 57){
                        num++;
                    }
                    else{
                        space++;
                    }
                }

                System.out.println(small + " " + capital + " " + num + " " + space);

            }
        }
    }
}
