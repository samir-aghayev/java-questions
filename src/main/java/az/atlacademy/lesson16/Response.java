package az.atlacademy.lesson16;

import java.util.Objects;

public class Response<T, U> {
    private T data1;
    private U data2;

    public Response(T data1, U data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Response<?, ?> response)) return false;
        return Objects.equals(data1, response.data1) && Objects.equals(data2, response.data2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data1, data2);
    }

    @Override
    public String toString() {
        return "Response{data1=%s, data2=%s}".formatted(data1, data2);
    }
}
