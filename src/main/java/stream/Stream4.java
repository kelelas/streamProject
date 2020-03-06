package stream;

import java.util.Arrays;

public class Stream4 {
    public static void main(String[] args) {
        int[] array = new int[]{1,0,5,30,0,0,-34,-3,7};
        long intStreamCount = Arrays.stream(array).filter(n->n>0).count();
        System.out.println(intStreamCount);
    }
}
