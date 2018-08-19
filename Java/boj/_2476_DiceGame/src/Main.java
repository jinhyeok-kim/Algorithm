import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] price = new int[N];

        for(int n = 0; n < N; n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            ArrayList<Integer> dice = new ArrayList<>();

            while(st.hasMoreTokens()){
                dice.add(Integer.parseInt(st.nextToken()));
            }
            HashSet<Integer> data = new HashSet<Integer>(dice);
            ArrayList<Integer> dice1 = new ArrayList<>(data);

            if(dice1.size() == 1){
                price[n] = 10000 + dice1.get(0)*1000;
            }else if(dice1.size() == 2){
                if(dice.get(0) == dice.get(1)){
                    price[n] =  1000 + dice.get(0)*100;

                }else if(dice.get(0) == dice.get(2)){
                    price[n] = 1000 + dice.get(0)*100;
                }
                else if(dice.get(1) == dice.get(2)){
                    price[n] = 1000 + dice.get(1)*100;
                }

            }else{
                dice1.sort(Integer::compareTo);
                price[n] = dice1.get(2)*100;

            }

        }

        int max = 0;

        for(int i = 0; i < N; i++){
            if(price[i]> max){
                max = price[i];
            }
        }

        System.out.println(max);

    }
}
