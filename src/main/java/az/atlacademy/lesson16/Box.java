package az.atlacademy.lesson16;

public class Box<T> {
    private T data;
    private boolean isEven;

    public Box(T num, boolean isEven) {
        this.data = num;
        this.isEven = isEven;
    }

    public T getData() {
        return data;
    }

    public boolean isEven() {
        return isEven;
    }

    @Override
    public String toString() {
        return "Box{" +
                "data=" + data +
                ", isEven=" + isEven +
                '}';
    }
}
