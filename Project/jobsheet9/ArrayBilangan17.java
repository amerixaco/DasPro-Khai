package jobsheet9;

import java.util.Arrays;

public class ArrayBilangan17 {
     public static void main(String[] args) {

        int[] bil = {5, 13, -7, 17};
 
        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i] + ", double = " + (bil[i] * 2));
        }
        System.out.println(Arrays.toString(bil));
 
        double[] bilDesimal = {5.0, 12867, 7.5, 2000000};
        for (int i = 0; i < bilDesimal.length; i++) {
            System.out.println("bilDesimal[" + i + "] = " + bilDesimal[i]);
        }
    }
}
