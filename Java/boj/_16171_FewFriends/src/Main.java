import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String textbook = br.readLine();
        String keyword = br.readLine();

        textbook = textbook.replaceAll("[0-9]","");

        if(textbook.contains(keyword)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

    }
}
