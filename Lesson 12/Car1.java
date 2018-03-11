/*
 * Course: CIS263AA Java Programming: Level 2
 * Lesson 1 (Chapter 10)
 * Exercise 2
 */


public class Car1 {

    private String make;
    private String model;


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    //constructor
    public Car1(String make, String model){
        this.make = make;
        this.model = model;
    }



}
