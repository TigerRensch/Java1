/*
 * Course: CIS263AA Java Programming: Level 2
 * Lesson 1 (Chapter 10)
 * Exercise 2
 */


public class Camaro extends Car1 {

    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Camaro(String make, String model)
    {
        super(make, model);
    }
}
