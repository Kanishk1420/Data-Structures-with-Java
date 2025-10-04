public class Solution{
    public static void main(String[] args) {
        final Car car = new ElectricCar();
        System.out.print(car.drive());
    }

    static class Automobile {
        private String drive() {
            return "Driving vehicle";
        }
}

static class Car extends Automobile {
    protected String drive() {
        return "Driving car";
    }
}

static class ElectricCar extends Car {
    @Override
    public final String drive() {
        return "Driving electric car";
    }

}
}