import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        ArrayList<Integer> queue = new ArrayList<>();

        for(int i = 1 ; i <= N; i++){
            queue.add(i);
        }

        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int cur = 0;
        int count = 0;

        for(int i = 0; i < M; i++){

            int poll_num = Integer.parseInt(st.nextToken());

                if(poll_num == queue.get(cur)){
                    queue.remove(cur);
                }else{
                    int j;
                    for(j = 0; j < queue.size(); j++){
                        if(queue.get(j) == poll_num){
                            break;
                        }
                    }


                    int small = 0;

                    if(j > cur){
                        if(j - cur <= queue.size() - j + cur){
                            small = j -cur;
                        }else{
                            small = queue.size() - j + cur;
                        }
                    }else{
                        if(cur -j <= queue.size() - cur + j){
                            small = cur - j;
                        }else{
                            small = queue.size() - cur + j;
                        }
                    }

                    count += small;
                    queue.remove(j);

                    if(j == queue.size()){
                        cur = 0;
                    }else {
                        cur = j;
                    }
                }


        }

        System.out.println(count);

    }
}
