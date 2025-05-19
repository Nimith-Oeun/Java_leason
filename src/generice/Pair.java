package generice;

public class Pair <k ,v> {
    private final k key;
    private v value;

    public Pair(k key, v value) {
        this.key = key;
        this.value = value;
    }

    public k getKey() {
        return key;
    }

    public v getValue() {
        return value;
    }

    public void setValue(v value) {
        this.value = value;
    }

    public static <k, v> Pair<k, v> of(k key, v value) {
        return new Pair<>(key, value);
    }

    public static void main(String[] args) {
        Pair<String, Double> pair = new Pair<>("pi", 3.14);
        System.out.println("Key: " + pair.getKey());
        System.out.println("Value: "  + pair.getValue());

        pair.setValue(3.15);
        System.out.println("Updated Value: " + pair.getValue());

        Pair<String, String> anotherPair = Pair.of("two", "two");
        System.out.println("Key: " + anotherPair.getKey());
        System.out.println("Value: " + anotherPair.getValue());
    }
}
