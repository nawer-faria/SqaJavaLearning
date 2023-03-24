package generics.generic;

public class Generic<T> {
    private T object;

    public Generic(T object) {

        this.object = object;
    }

   // public T add(int number1, int number2) {    need to know syntax. need type casting
   //     return number1 + number2;
   // }

    public T getObject() {

        return object;
    }
}
