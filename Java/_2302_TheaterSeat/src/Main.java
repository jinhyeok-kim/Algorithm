import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] seat = new int[N + 1];

        int M = scan.nextInt();
        int[] vip = new int[M + 1];

        int num = 0;

        for (int m = 0; m < M; m++) {
            vip[m] = scan.nextInt();
        }
        seat[0] = 1;
        seat[1] = 1;


        for (int i = 1; i < seat.length; i++) {
            if (vip[num] == i) {
                seat[i] = seat[i - 1];
            } else if (vip[num] == i - 1) {
                seat[i] = seat[i - 1];
                if(num < M) {
                    num++;
                }
            } else {
                if (i >= 2) {
                    seat[i] = seat[i - 1] + seat[i - 2];
                }
            }
        }

        System.out.println(seat[N]);
    }
}
