import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] word = new String[N];

        for(int n = 0; n <N; n++){
            word[n] = br.readLine();
        }

        word = new HashSet<String>(Arrays.asList(word)).toArray(new String[0]);

        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()) {
                    return 1;
                }else if(o1.length() < o2.length()){
                    return -1;
                }else if(o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                else{
                    return 0;
                }
            }
        });

        for(int i = 0; i < word.length; i++){
            System.out.println(word[i]);
        }

    }
}
