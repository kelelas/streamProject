package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Stream5 {
    public static void main(String[] args) {
        int a = 5;
        int[] array = new int[]{1,0,5,30,0,0,-34,-3,7};
        IntStream intStream = Arrays.stream(array);
        intStream.map(n -> n*a).forEach(System.out::println);

    }
}
