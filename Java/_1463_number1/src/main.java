import java.util.Scanner;

public class main {

//    static int one(int k){
//
//        if(k == 1){
//            return 0;
//        }
//        else{
//            int result = 0;
//
//            if(k%3 == 0){
//                if(k%2 == 0){
//                    result = (one(k/3)+1 < one(k/2)+1)? one(k/3)+1: one(k/2)+1;
//                    return one(k-1)+1 < result? one(k-1)+1: result;
//                }
//                else{
//                    return one(k/3)+1 < one(k-1)+1? one(k/3)+1: one(k-1)+1;
//                }
//            }
//            else if(k%2 == 0){
//                return one(k/2)+1 < one(k-1)+1? one(k/2)+1: one(k-1)+1;
//            }
//            else{
//                return one(k-1)+1;
//            }
//        }
//    }

    static int min(int x, int y, int z){
        int result = x < y? x:y;
        return z < result? z: result;
    }

    static int min(int x, int y){
        return x < y? x: y;
    }

    public static void main(String[] args) {
//        System.out.println(one(16));
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int[] one = new int[k+1];
        one[1] = 0;

        for(int i = 2; i <= k; i++){
            int result = 0;
            if(i%3 == 0){
                if(i%2 == 0){
                    result = min(one[i/3]+1, one[i/2]+1, one[i-1]+1);
                }
                else{
                    result = min(one[i/3]+1, one[i-1]+1);
                }
            }
            else if(i%2 == 0){
                result = min(one[i/2]+1, one[i-1]+1);
            }
            else{
                result = one[i-1]+1;
            }
            one[i] = result;
        }
        System.out.println(one[k]);
//        for(int i = 1; i < k; i++){
//            System.out.println(i + ":" + one[i]);
//        }
    }
}
