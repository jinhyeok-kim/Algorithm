import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            String ox = br.readLine();
            char[] answer = ox.toCharArray();
            int totalPoint = 0;
            int point = 0;
            for(int j = 0; j< answer.length; j++){
                if(answer[j] == 'O'){
                    point++;
                    totalPoint += point;
                }
                else{
                    point = 0;
                }
            }
            System.out.println(totalPoint);
        }
    }
}
