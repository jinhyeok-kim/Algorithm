import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int wide = min(w-x, x);
        int height = min(h-y,y);

        if(wide > height){
            System.out.println(height);
        }else{
            System.out.println(wide);
        }

    }

    static int min(int x, int y){
        if(x<y){
            return x;
        }else{
            return y;
        }
    }
}
