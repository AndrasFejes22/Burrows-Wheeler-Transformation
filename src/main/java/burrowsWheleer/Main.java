package burrowsWheleer;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //System.out.println(BurrowsWheeler.allRecursive(2,0, "abc"));
        System.out.println(BurrowsWheeler.getPermutation("abcd"));

        String input = "banana";

        String end = input.substring(input.length()-1);
        String begin = input.substring(0, input.length()-1);

        System.out.println("END: "+end);
        System.out.println("BEGIN: "+begin);
        System.out.println(end.concat(begin));

        System.out.println("array: ");
        System.out.println();

        //System.out.print(Arrays.toString(BurrowsWheeler.shifting("bananabar")));
        System.out.println("matrix:");

        for (String element: BurrowsWheeler.shifting("bananabar")) {
            System.out.println(element);
        }
        System.out.println();
        System.out.println("letters:");

        System.out.println(BurrowsWheeler.lastLetters(BurrowsWheeler.shifting("bananabar")));
        System.out.println();
        System.out.println("num:");

        System.out.println(BurrowsWheeler.inputNum(BurrowsWheeler.shifting("bananabar"), "bananabar"));
        System.out.println();
        System.out.println("print matrix:");
        BurrowsWheeler.printMatrix(BurrowsWheeler.shifting("bananabar"));
        System.out.println();
        System.out.println("2d array:");
        System.out.println(Arrays.deepToString(BurrowsWheeler.stringTo2DArray("abc")));
    }
}
