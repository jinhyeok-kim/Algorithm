import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] binary = br.readLine().toCharArray();

        int[] eight = new int[1000000];

        int count = 1;
        int answer = 0;

        for(int i = binary.length-1; i >=0; i--){
            if(count == 3){
                eight[answer] += charToNum(binary[i])*4;
                answer++;
                count = 1;
            }else if(count == 2){
                eight[answer] +=  charToNum(binary[i])*2;
                count++;
            }
            else if(count == 1){
                eight[answer] +=  charToNum(binary[i])*1;
                count++;
            }
        }

        for(int i = binary.length/3; i >= 0; i--){
            if(i == binary.length/3 && eight[i] == 0 && binary.length != 1){

            }else {
                System.out.print(eight[i]);
            }
        }

    }

    static int charToNum(char a){
        if((int)a == 49){
            return 1;
        }
        else if((int)a == 48){
            return 0;
        }
        return 0;
    }
}
