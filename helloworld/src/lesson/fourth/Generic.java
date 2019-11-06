package lesson.fourth;

/**
 * @author lipc
 */
public class Generic<T> {
    public T data;

    public Generic(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }
}
