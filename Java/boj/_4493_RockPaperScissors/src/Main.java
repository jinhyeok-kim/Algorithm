import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());



        for(int t = 0; t < T; t++){
            int N = Integer.parseInt(br.readLine());
            int p1 = 0;
            int p2 = 0;

            for(int n = 0; n < N; n++){
                StringTokenizer st = new StringTokenizer(br.readLine());

                int rslt = result(st.nextToken().charAt(0), st.nextToken().charAt(0));

                if(rslt == 1){
                    p1++;
                }else if(rslt == -1){
                    p2++;
                }
            }

            if(p1>p2){
                System.out.println("Player 1");
            }else if(p1<p2){
                System.out.println("Player 2");
            }else{
                System.out.println("TIE");
            }
        }

    }

    // R : 82, P : 80 S: 83
    static int result(int p1, int p2){
        if(p1 == p2){
            return 0;
        }
        else if(p1 == 82){
            if(p2 == 80){
                return -1;
            }else{
                return 1;
            }
        }
        else if(p1 == 80){
            if(p2 == 82){
                return 1;
            }else{
                return -1;
            }

        }
        else if(p1 == 83){
            if(p2 == 82){
                return -1;
            }else{
                return 1;
            }
        }
        return 0;
    }
}


