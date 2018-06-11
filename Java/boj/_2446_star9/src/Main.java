import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

//        N/2+1

        for(int i = 0; i < 2*N-1; i++){
            if(i < N){
                for(int j = 0; j < (2*N-1)-i; j++){
                    if(j < i){
                        System.out.print(" ");
                    }else {
                        System.out.print("*");
                    }
                }
            }else{
                for(int j = 0; j < i+1; j++){
                    if(j< 2*N-i-2){
                        System.out.print(" ");
                    }
                    else {

                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}
