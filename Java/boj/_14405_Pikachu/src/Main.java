import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        char[] word = S.toCharArray();

        //a:97 z:122
        //p:112 i:105 k:107 a:97 c:99 h:104 u:117

        int i;

        for(i = 0; i < word.length; i++){
            if(word[i] != 112 && word[i] != 105 && word[i] != 107 &&
                    word[i] != 97 && word[i] != 99 && word[i] != 104 &&
                    word[i] != 117){
                break;
            }
            if(word[i] == 112){
                i++;
                if(i == word.length || word[i] != 105){
                    i--;
                    break;
                }
            }
            else if(word[i] == 107){
                i++;
                if(i == word.length || word[i] != 97 ){
                    i--;
                    break;
                }
            }
            else if(word[i] == 99){
                i++;
                if(i == word.length || word[i] != 104){
                    i--;
                    break;
                }
                else{
                    i++;
                    if(i == word.length || word[i] != 117){
                        i--;
                        break;
                    }
                }

            }
            else{
                i--;
                break;
            }
//            if(word[i-1] == 112){
//                if(word[i] != 105){
//                    break;
//                }
//            }
//            if(word[i-1] == 107){
//                if(word[i] != 97){
//                    break;
//                }
//            }
//            if(word[i-1] == 99){
//                if(word[i] != 104){
//                    break;
//                }
//                else{
//                    if(i+1 == word.length){
//                        break;
//                    }
//                    else{
//                        if(word[i+1] != 117){
//                            break;
//                        }
//                    }
//                }
//            }
//            if(word[i] == word[i-1]){
//                break;
//            }
        }

        if(word.length == 1 || i != word.length){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }

    }
}
