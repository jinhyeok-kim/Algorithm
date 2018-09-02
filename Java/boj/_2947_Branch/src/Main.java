import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] array = new int[st.countTokens()];
        int s = 0;
        while(st.hasMoreTokens()){
            array[s++] = Integer.parseInt(st.nextToken());
        }

        while (1 != array[0] || 2 != array[1] ||
                3 != array[2] || 4 != array[3] ||
                5 != array[4]) {
            for (int i = 0; i < array.length; i++) {
                if (i + 1 != array.length && array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    for (int j = 0; j < array.length; j++) {
                        System.out.print(array[j] + " ");
                    }
                    System.out.println();
                }
            }
        }


    }
}
