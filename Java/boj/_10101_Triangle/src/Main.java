import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        ArrayList<Integer> triangle = new ArrayList<>();

        triangle.add(a);
        triangle.add(b);
        triangle.add(c);

        if(triangle.get(0) == 60 && triangle.get(1) == 60 && triangle.get(2) == 60){
            System.out.println("Equilateral");
        }else if(triangle.get(0)+triangle.get(1)+triangle.get(2) == 180){
            HashSet data = new HashSet(triangle);
            if(data.size() == 2){
                System.out.println("Isosceles");
            }else if(data.size() == 3){
                System.out.println("Scalene");
            }
        }else{
            System.out.println("Error");
        }



    }
}
