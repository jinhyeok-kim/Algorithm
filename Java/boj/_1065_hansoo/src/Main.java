import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int count = 0;

        scan.close();

        for(int i = 1; i <= N; i++){
            if(i < 100){
                count++;
            }
            else {
                int first = i / 100;
                int second = i / 10 - first * 10;
                int third = i  - (first * 100 + second * 10);

                if((first-second) == (second - third)){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
