import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int t = 0; t < T; t++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] point = new int[5];
            int i = 0;
            while(st.hasMoreTokens()){
                point[i] = Integer.parseInt(st.nextToken());
                i++;
            }
            Arrays.sort(point);
            if(point[3]-point[1] >= 4){
                System.out.println("KIN");
            }else{
                System.out.println(point[1]+point[2]+point[3]);
            }
        }


    }
}
