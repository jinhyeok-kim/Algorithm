import java.util.Scanner;

public class Main {

    static int bigger(int x, int y){
        if(x>y){
            return x;
        }
        else{
            return y;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int k = scan.nextInt();
        int[] triangle = new int[(k*k+k)/2];
        int[] T = new int[(k*k+k)/2];

        for(int i = 0; i < (k*k+k)/2; i++) {
            triangle[i] = scan.nextInt();
        }
        T[0] = triangle[0];
        int max = 0;


        for(int i = 1; i < k; i++){
            for(int j = 0; j <= i; j++){
                int z = i-1;

                if(j == 0){
                    T[((i*i+i)/2)+j] = T[((z*z+z)/2)] + triangle[((i*i+i)/2)];

                }
                else if(j == i){
                    T[((i*i+i)/2)+j] = T[((z*z+z)/2)+(j-1)] + triangle[((i*i+i)/2)+j];
                }
                else {
                    T[((i * i + i) / 2) + j] = bigger(T[((z * z + z) / 2) + (j - 1)], T[((z * z + z) / 2) + j]) + triangle[((i * i + i) / 2) + j];
                }

                max = bigger(max, T[((i * i + i) / 2) + j]);
            }
        }

        System.out.println(max);

    }
}