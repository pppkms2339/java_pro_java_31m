public class Car {

    private String model;
    private int maxSpeed;

    public Car(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Car car = (Car) obj;
        return maxSpeed == car.maxSpeed;
    }

    @Override
    public int hashCode() {
//        if (model == null) {
//            int result = 0;
//        } else {
//            int result = model.hashCode();
//        }
        int result = model == null ? 0 : model.hashCode();
        result = 31 * result + maxSpeed;
        return result;
    }
}
