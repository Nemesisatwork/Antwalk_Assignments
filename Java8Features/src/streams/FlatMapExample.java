package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<Integer> num1 = Arrays.asList(10, 20, 30);
        List<Integer> num2 = Arrays.asList(40, 50, 60);
        List<Integer> num3 = Arrays.asList(70, 80, 90, 100);

        List<List<Integer>> biglist = Arrays.asList(num1, num2, num3);
        System.out.println(biglist);

        List<Integer> flatlist = biglist.stream().flatMap(list -> list.stream())
                .collect(Collectors.toList());

        System.out.println(flatlist);
    }
}
