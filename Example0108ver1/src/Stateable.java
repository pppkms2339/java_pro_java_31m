public interface Stateable {

    int OPEN = 1; // по умолчанию имеют модификатор public static final
    int CLOSED = 0;

    void printState(int n);

}
