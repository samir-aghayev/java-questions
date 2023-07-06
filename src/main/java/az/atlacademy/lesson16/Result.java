package az.atlacademy.lesson16;

public class Result <T>{
    private T data;
    private String className;

    public Result() {
    }

    public Result(T data, String className) {
        this.data = data;
        this.className = className;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
