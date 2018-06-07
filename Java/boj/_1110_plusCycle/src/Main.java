import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        int first = N / 10;
        int second = N % 10;
        int temp = 0;

        int count = 0;

        if (N != 0) {
            while (N != sum) {

                temp = second;
                second = (first + second) % 10;
                first = temp;


                sum = first * 10 + second;

                first = sum / 10;
                second = sum % 10;
                count++;

            }
            System.out.println(count);
        } else {
            System.out.println(1);
        }


    }
}
