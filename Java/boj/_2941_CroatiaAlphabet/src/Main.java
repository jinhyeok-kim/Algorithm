import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] alpha = br.readLine().toCharArray();

        int count = 1;

        // c : 99, = : 61, - : 45, d : 100
        // z : 122, l : 108, j : 106, n : 110, s : 115


        if(alpha.length == 1){
            System.out.println(1);
        }else {
            for (int i = 1; i < alpha.length; i++) {
                if(alpha[i-1] == 99){
                    if(alpha[i] == 61 || alpha[i] == 45){
//                        i++;
                    }else{
                        count++;
                    }
                }
                else if(alpha[i-1] == 100){
                    if(alpha[i] == 45){

                    }
                    else if(alpha[i] == 122){
                        if(i+1 < alpha.length && alpha[i+1] == 61){
                            i++;
                        }
                        else{
                            count++;
                        }
                    }
                    else{
                        count++;
                    }
                }
                else if(alpha[i-1] == 108){
                    if(alpha[i] == 106){
//                        i++;
                    }else{
                        count++;
                    }
                }
                else if(alpha[i-1] == 110){
                    if(alpha[i] == 106){
//                        i++;
                    }else{
                        count++;
                    }
                }
                else if(alpha[i-1] == 115){
                    if(alpha[i] == 61){
//                        i++;
                    }else{
                        count++;
                    }
                }
                else if(alpha[i-1] ==122){
                    if(alpha[i] == 61) {
//                        i++;
                    }else{
                        count++;
                    }
                }else{
                    count++;
                }

            }

            System.out.println(count);
        }





    }
}
