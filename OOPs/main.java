package OOPs;

public class main {
    public static void main(String[] args) {
        OOPs.car car = new car();
        car.color = "red";
        car.brand = "Maruti";
        car.model = "WagonR";
        car.speed = 40;
        car.yearOfManufacture = 2026;

        car.accelerate(1);
        System.out.println(car.speed);

    }
}
