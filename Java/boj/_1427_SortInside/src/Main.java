import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine());

        //정수 자릿수 구하는 방법!!
        int Nlength = (int)(Math.log10(N)+1);

        long[] digits = new long[Nlength];

        for(int i =0; i < Nlength; i++){
            digits[i]= N%10;
            N = N/10;
        }

        Arrays.sort(digits);

        for(int i =0 ; i < Nlength;i++){
            System.out.print(digits[Nlength-i-1]);
        }



    }
}
