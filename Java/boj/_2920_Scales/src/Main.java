import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] scale = new int[8];
        for(int i = 0; i < 8; i++){
            scale[i] = Integer.parseInt(st.nextToken());
        }
        int i = 0;

        if(scale[0] == 1) {

            for (i = 1; i <= 8; i++) {
                if (scale[i - 1] != i) {
                    System.out.println("mixed");
                    break;
                }
            }
            if(i == 9){
                System.out.println("ascending");
            }
        }
        else if(scale[0] == 8){
            for (i = 1; i <= 8; i++) {
                if (scale[i - 1] != 9-i) {
                    System.out.println("mixed");
                    break;
                }
            }
            if(i == 9){
                System.out.println("descending");
            }


        }
        else{
            System.out.println("mixed");
        }

    }
}
