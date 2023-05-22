package Interfaces;

public class Honda implements OperateCar{
    int speed =0;
    @Override
    public void speedUp(int increment) {
        System.out.println("Speed is increasing :"+increment);
        this.speed += increment;
        System.out.println("last speed : "+this.speed);
    }

    @Override
    public void speedDown(int decrement) {
        System.out.println("Speed is decreasing :"+decrement);
        this.speed -= decrement;
        System.out.println("last speed : "+this.speed);
    }
}
