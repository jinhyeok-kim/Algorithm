import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        char answer = ' ';
        switch(N){
            case 1:
                answer = 'a';
                break;
            case 2:
                answer = 'b';
                break;
            case 3:
                answer = 'b';
                break;
            case 4:
                answer = 'c';
                break;
            case 5:
                answer = 'd';
                break;
            case 6:
                answer = 'd';
                break;
            case 7:
                answer = 'd';
                break;
            case 8:
                answer = 'c';
                break;
        }

        System.out.println(answer);
    }
}
