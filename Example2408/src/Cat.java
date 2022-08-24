public class Cat {

    private String id;

    public Cat(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id='" + id + '\'' +
                '}';
    }
}
