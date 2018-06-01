import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int[] Alphabet = new int[26];

        for(int i = 0; i < Alphabet.length; i++){
            Alphabet[i] = -1;
        }
        // a : 97 z : 122
        for(int i = 0; i < word.length(); i++){
            if(Alphabet[(int)word.charAt(i)- 97] == -1) {
                Alphabet[(int) word.charAt(i)- 97] = i;
            }
        }

        for(int i = 0; i <= 25; i++){
            System.out.print(Alphabet[i] + " ");
        }
    }
}
