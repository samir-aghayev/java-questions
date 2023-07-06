package az.atlacademy.lesson16;

import java.util.Objects;

public class Response2 <T, U>{
    private T data1;
    private U data2;

    public Response2(T data1, U data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    public T getData1() {
        return data1;
    }

    public void setData1(T data1) {
        this.data1 = data1;
    }

    public U getData2() {
        return data2;
    }

    public void setData2(U data2) {
        this.data2 = data2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Response2<?, ?> response2)) return false;
        return Objects.equals(getData1(), response2.getData1()) && Objects.equals(getData2(), response2.getData2());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getData1(), getData2());
    }

    @Override
    public String toString() {
        return "Response2{data1=%s, data2=%s}".formatted(data1, data2);
    }
}
