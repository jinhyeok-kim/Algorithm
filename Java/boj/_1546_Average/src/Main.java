import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());


        double[] subject = new double[N];

        double max = 0;

        for(int i = 0; i < subject.length; i++){
            subject[i] = Double.parseDouble(st.nextToken());
            if(subject[i] > max){
                max = subject[i];
            }
        }

        for(int i = 0; i < subject.length; i++){
            subject[i] = (subject[i]/max)*100;
        }

        double average = 0;

        for(int i = 0; i < subject.length; i++){
            average += subject[i];
        }

        average = average/subject.length;

        System.out.printf("%.2f", average);

    }
}
