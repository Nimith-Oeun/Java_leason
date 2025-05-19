package stream;

import java.util.List;

public class FilterDemo {
    public static void main(String[] args) {
        List<String> list = MockData.namesInKhmer().stream()
                .filter(name -> name.startsWith("ស"))
                .distinct()
                .toList();

        System.out.println("Array = "+list);

        for (var li: list) {
            System.out.println("Object = "+li);
        }
    }
}
