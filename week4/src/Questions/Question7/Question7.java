package Questions.Question7;
import Domain.Tester.Simulate;

public class Question7 implements Simulate{
    private String licensePlate;
    private double speed; // kilometers per hour
    private double maxSpeed; // kilometers per hour

    // constructors
    public Question7(String licensePlate1, double maxSpeed1) {
        this.licensePlate = licensePlate1;
        this.speed = 0.0;
        if (maxSpeed1 >= 0.0) {
            maxSpeed = maxSpeed1;
        } else {
            maxSpeed = 0.0;
        }
    }
    public Question7(String licensePlate1, double maxSpeed1, double speed1) {
        this.licensePlate = licensePlate1;
        this.speed=speed1;
        this.maxSpeed=maxSpeed1;
        if (speed1 < 0 ){
            this.speed = 0.0;
        } else if (speed1 > maxSpeed1) {
            this.speed = maxSpeed1;
        }
    }

    public void print(Question7 car){
        System.out.println("License Plate Number - "+car.licensePlate);
        System.out.println("Maximum allowed speed - "+car.maxSpeed);
        System.out.println("Speed of vehicle - "+car.speed);
    }

    @Override
    public void run() {

    }
}
