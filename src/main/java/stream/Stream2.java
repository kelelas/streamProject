package stream;

import java.util.Arrays;
import java.util.OptionalInt;

public class Stream2 {
    public static void main(String[] args) {
        int[] array = new int[]{1,0,5,30,0,0,-34,-3,7};
        int intStream = Arrays.stream(array).min().getAsInt();


        System.out.println(intStream);
    }
}
