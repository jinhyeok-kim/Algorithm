import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;

        char[] name = br.readLine().toCharArray();

        for(int i =0 ; i < name.length; i++){
            if(name[i] >= 65 && name[i] <= 90){
                System.out.print((char)name[i]);
            }

        }

    }
}

