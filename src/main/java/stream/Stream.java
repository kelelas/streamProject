package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Stream {


    public static void main(String[] args) {
        int[] array = new int[]{1,2,5,32,43,12,34,3,7};
        IntStream intStream = Arrays.stream(array);
        double average = intStream.mapToDouble(n -> n).average().getAsDouble();
        System.out.println(average);
        double sum = 0;
        for (int n: array){
            sum +=n;
        }
        System.out.println(sum/array.length);
    }

}
