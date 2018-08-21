import java.util.Scanner;

public class Car {

    int carSpeed;

    public static void main(String[] args) {

        System.out.println("Hell World");

        Scanner scaner = new Scanner(System.in);
        int carspeed = scaner.nextInt();
        Car car = new Car();
        car.setSpeed(carspeed);
        System.out.println(car.CarSpeed());
    }

    public void setSpeed(int speed) {

        carSpeed=speed;

    }

    int CarSpeed() {
        return carSpeed;
    }
}
