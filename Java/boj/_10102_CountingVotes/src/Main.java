import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        char[] person = br.readLine().toCharArray();
        int a = 0;
        int b = 0;
        for(int p = 0; p < person.length; p++){
            if(person[p] == 65){
                a++;
            }else if(person[p] == 66){
                b++;
            }
        }

        if(a>b){
            System.out.println("A");
        }else if(b>a){
            System.out.println("B");
        }else{
            System.out.println("Tie");
        }

    }
}
