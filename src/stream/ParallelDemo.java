package stream;

import java.util.List;

public class ParallelDemo {
    public static void main(String[] args) {
        int sum = MockData.integers().stream()
                .parallel()
                .mapToInt(i -> i * i)
                .sum();
        System.out.println("Done" + sum);
    }
}
