public class Stack<T> {

    private StackItem top;

    public void push(T item) {
        StackItem temp = new StackItem();
        temp.value = item;
        temp.next = top;
        top = temp;
    }

    public T pop() {
        T a = top.value;
        top = top.next;
        return a;
    }

    // Проверка пуст ли стек
    public boolean isEmpty() {
        return (top == null);
    }

    private class StackItem {
        T value;
        StackItem next;
    }
}