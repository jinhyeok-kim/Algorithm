import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int temp = 0;
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N-i; j++){
                System.out.print(" ");

            }

            int k = (int) baseLog(N/3, 2);
            for(int j = 1; j <= (i*2)-1; j++){
                if(i%3 == 1){

                    System.out.print("*");
                }
                else if(i%3 == 2){
                    if(j == 1 || j == (i*2)-1) {
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                else if(i%3 == 0){
                    System.out.print("*");
                }


            }
            System.out.println();
        }

//        int k = (int) baseLog(N/3, 2);

//        System.out.println(k);
//        three();
//        blank(6);
    }

    static double baseLog(double x, double base){
        return Math.log(x)/Math.log(base);
    }

//    static void three(){
//        for(int i = 1; i < 4; i++){
//            for(int j = 1; j < (i*2); j++){
//                if(i == 2 && j == 2) {
//                    System.out.print(" ");
//                }
//                else {
//                    System.out.print("*");
//                }
//
//            }
//            System.out.println();
//        }
//    }
//
//    static void blank(int num){
//        num = num-1;
//        for(int i = 0; i < num; i++){
//            for(int j = i; j < num; j++){
//                System.out.print(" ");
//
//            }
//            System.out.println();
//        }
//    }
}
