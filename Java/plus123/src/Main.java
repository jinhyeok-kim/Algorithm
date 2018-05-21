import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int t = 0; t < T; t++) {
            int N = scan.nextInt();
            int [] plusNum = new int [N+1];

            if(N>3) {
                plusNum[1] = 1;
                plusNum[2] = 2;
                plusNum[3] = 4;

                for (int i = 4; i < plusNum.length; i++) {
                    plusNum[i] = plusNum[i - 1] + plusNum[i - 2] + plusNum[i - 3];
                }
            }
            else if(N == 1){
                plusNum[1] = 1;
            }
            else if(N == 2){
                plusNum[2] = 2;
            }
            else if(N == 3){
                plusNum[3] = 4;
            }

            System.out.println(plusNum[N]);

        }
    }
}
