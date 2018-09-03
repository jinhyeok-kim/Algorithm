import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = "";
        while(!(sentence = br.readLine()).equals("*")){
            char[] pen = sentence.toCharArray();
            int[] alpha = new int[26];

            for(int p = 0; p < pen.length; p++){
                if(pen[p]-97 >=0 && pen[p]-97 <=122 ){
                    alpha[pen[p]-97]++;
                }
            }

            int i =0;

            for(i = 0; i  < alpha.length; i++){
                if(alpha[i] == 0){
                    break;
                }
            }

            if(i == alpha.length){
                System.out.println("Y");
            }else{
                System.out.println("N");
            }


        }

    }
}
