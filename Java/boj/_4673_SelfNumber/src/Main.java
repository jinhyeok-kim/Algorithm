import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean[] num = new boolean[10001];

        for(int i =1; i < num.length; i++){
            num[i] = true;
        }
        for(int i = 1; i < num.length; i++){
            int temp = i;
            while(temp <= 10000){
                if(temp < 100) {
                    temp = temp + temp / 10 + temp % 10;
                }
                else if(temp < 1000){
                    temp = temp + temp/100 + ((temp%100 - temp%10)/10) + temp % 10;
                }
                else{
                    temp = temp + temp/1000 +  ((temp % 1000 - temp%100)/100) +((temp%100 - temp%10)/10) + temp%10;
                }
                if(temp <= 10000) {
                    num[temp] = false;
                }
            }
        }

        for(int i = 1; i < num.length; i++){
            if(num[i]){
                System.out.println(i);
            }
        }
    }
}
