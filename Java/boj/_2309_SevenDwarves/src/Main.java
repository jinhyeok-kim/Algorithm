import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] dwarves = new int[9];

        for(int i = 0; i < dwarves.length; i++){
            dwarves[i] = scan.nextInt();
        }

        scan.close();

        Arrays.sort(dwarves);

        int value = 0;
        for(int i = 0; i < dwarves.length; i++){
            value += dwarves[i];
        }

        value = value - 100;

        for(int i = 0; i < dwarves.length;i++){
            for(int j = i+1; j< dwarves.length; j++){
                if(dwarves[i] + dwarves[j] == value){
                    for(int k = 0; k < dwarves.length; k++){
                        if(k != i && k != j) {
                            System.out.println(dwarves[k]);
                        }
                    }
                }
            }
        }


    }
}
