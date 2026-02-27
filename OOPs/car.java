package OOPs;

public class car {
    String color;

    String brand;

    String model;

    int yearOfManufacture;

    int speed;


    public void accelerate(int increment){
        speed += increment;
    }

    public void brake(int decrement){
        speed -= decrement;
        if(speed < 0){
            speed = 0;
        }
    }
}
