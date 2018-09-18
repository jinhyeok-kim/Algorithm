import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        for(int i = 1; i <= 5; i++){
            char[] fbi = br.readLine().toCharArray();
            for(int j = 0; j < fbi.length; j++){
                if(fbi[j] == 70) {
                    if (fbi[j + 1] == 66 && j + 1 != fbi.length + 1) {
                        if (fbi[j + 2] == 73 && j + 2 != fbi.length + 1) {
                            System.out.print(i + " ");
                            count++;
                            break;
                        }
                    }
                }

            }
        }
        if(count == 0){
            System.out.println("HE GOT AWAY!");
        }

    }
}
