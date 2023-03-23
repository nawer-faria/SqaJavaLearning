package generics.generic;

public class Generic<T> {
    private T object;

    public Generic(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }
}
