import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int t = 0; t < T; t++){
            String[] coordinates = br.readLine().split(" ");
            int a = Integer.parseInt(coordinates[3]) - Integer.parseInt(coordinates[0]);
            int b = Integer.parseInt(coordinates[4]) - Integer.parseInt(coordinates[1]);
            int c = (int)Math.sqrt(a*a + b*b);
            int rsum = Integer.parseInt(coordinates[2]) + Integer.parseInt(coordinates[5]);
            int rminus = Integer.parseInt(coordinates[2]) - Integer.parseInt(coordinates[5]);

            if(rminus<0) rminus*= -1;

            if(coordinates[0].equals(coordinates[3]) && coordinates[1].equals(coordinates[4]) && coordinates[2].equals(coordinates[5]) ){
                System.out.println(-1);
            }
            else if(c>rsum) System.out.println(0);
            else if(c == rsum) System.out.println(1);
            else if(c<rsum && rminus < c) System.out.println(2);
            else if(c<rsum && rminus>c) System.out.println(0);
            else if(c<rsum && rminus==c) System.out.println(1);

        }
    }
}
