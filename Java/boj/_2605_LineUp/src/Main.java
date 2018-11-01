import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] line = new int[N];

        for(int i = 0; i < line.length; i++){
            line[i] = -1;
        }

        String[] student = br.readLine().split(" ");

        for(int i = student.length-1; i >= 0; i--){
            int count = i;
            for(int j = 0; j < count; j++){
                if(line[Integer.parseInt(student[j])] != -1){
                    count++;
                }
            }
            line[Integer.parseInt(student[i])] = i;


        }





    }
}
