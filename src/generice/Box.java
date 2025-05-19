package generice;

public class Box <T>{

    private T content;

    public Box(T value) {
        this.content = value;
    }

    public T getValue() {
        return content;
    }

    public void setValue(T value) {
        this.content = value;
    }

    public boolean hasContent() {
        return content != null;
    }

    public void clear() {
        content = null;
    }

    @Override
    public String toString() {
        return "Box{" +
                "value=" + content +
                '}';
    }

    public <U> Box<U> transformContent(Transformer<T, U> transformer) {
        if (content == null){
            return new Box<>(null);
        }
        return new Box<>(transformer.transform(content));
    }

    public interface Transformer<T, U> {
        U transform(T value);
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Hello");
        System.out.println(stringBox);
        stringBox.setValue("World");
        System.out.println(stringBox);
        stringBox.clear();
        System.out.println(stringBox);
    }
}
