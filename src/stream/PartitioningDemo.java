/*
Partitioning is a special case of grouping. With partitioning, the key is always a Boolean.
 */

package stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningDemo {
    public static void main(String[] args) {
        Map<Boolean, List<Integer>> partition = MockData.integers().stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("partition = " + partition);
    }
}
