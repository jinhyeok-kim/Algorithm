import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int t = 0; t < T; t++) {
            int N = scan.nextInt();
            int [] coin = new int [N];
            for(int i = 0; i<N; i++) {
                coin[i] = scan.nextInt();
            }

            int M = scan.nextInt();


            int [] money = new int [M+1];

            for(int i = 0; i <coin.length; i++){
                if(coin[i]<= M) {
                    money[coin[i]]++;
                    for (int j = coin[i] + 1; j < money.length; j++) {
                        money[j] += money[j - coin[i]];
                    }
                }
            }

            System.out.println(money[M]);

        }
    }
}
