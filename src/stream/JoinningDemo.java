package stream;

import java.util.stream.Collectors;

public class JoinningDemo {
    public static void main(String[] args) {
        String name = MockData.namesInKhmer().stream()
                .collect(Collectors.joining(","));
        System.out.println("name = " + name);
    }
}
