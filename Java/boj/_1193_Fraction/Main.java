import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();


        int j =1;
        int i = 1;
            while(true) {
                for (int k = 0; k < i; k++) {
                    if (j == a) {
                        int denominator = 1;
                        int numerator = 1;
                        int first = (i*i-i+2)/2;
                        int odd = i%2;
                        int key = a - first;
                        if(odd == 1){
                            denominator = i - key;
                            numerator = numerator + key;
                        }
                        else{
                            denominator = denominator + key;
                            numerator = i - key;
                        }
                        System.out.println(denominator +"/" + numerator);
                        System.exit(0);
                    }
                    j++;
                }
                i++;
            }

    }
}
