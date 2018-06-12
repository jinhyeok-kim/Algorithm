import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer nt = new StringTokenizer(br.readLine());

        int[] NA = new int[N];

        for(int i = 0; i < N; i++){
            NA[i] = Integer.parseInt(nt.nextToken());
        }

        Arrays.sort(NA);

        int M = Integer.parseInt(br.readLine());

        StringTokenizer mt = new StringTokenizer(br.readLine());

        int[] MA = new int[M];

        for(int i = 0; i < M; i++){
            MA[i] = Integer.parseInt(mt.nextToken());
        }


        for(int i = 0; i < M; i++){
            System.out.println(binarySearch(NA, MA[i]));

        }
    }

    static int binarySearch(int[] array, int target){
        int start = 0;
        int end = array.length-1;
        int mid = (start + end)/2;

        while(end-start >= 0){
            if(array[mid] == target){
                return 1;
            }else if(array[mid] < target) {
                start = mid + 1 ;
            }else{
                end = mid -1;
            }
            mid =(end + start)/2;
        }

        return 0;
    }
}
