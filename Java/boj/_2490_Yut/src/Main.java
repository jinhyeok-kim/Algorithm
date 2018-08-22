import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int result = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) +
                    Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());

            switch (result){
                case 4:
                    System.out.println("E");
                    break;
                case 3:
                    System.out.println("A");
                    break;
                case 2:
                    System.out.println("B");
                    break;
                case 1:
                    System.out.println("C");
                    break;
                case 0:
                    System.out.println("D");
                    break;

            }

    }
}
}
