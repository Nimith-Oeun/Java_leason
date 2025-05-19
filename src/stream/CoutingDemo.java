package stream;

import java.util.Map;
import java.util.stream.Collectors;

public class CoutingDemo {
    public static void main(String[] args) {
        Map<String , Long> counting = MockData.students().stream()
                .collect(Collectors.groupingBy(st -> {
                    if (st.getGrade() >= 90) {
                        return "A";
                    } else if (st.getGrade() >= 80) {
                        return "B";
                    } else if (st.getGrade() >= 70) {
                        return "C";
                    } else if (st.getGrade() >= 60) {
                        return "D";
                    } else {
                        return "F";
                    }
                }, Collectors.counting()));

        System.out.println("counting = " + counting);
    }
}
