public class Car {
    private String model;
    private double price;

    public Car(String model, double price) {
        this.model = model;
        this.price = price;
    }
    // get model and price
    public String getModel() {
        return this.model;
    }
    public double getPrice() {
        return this.price;
    }

    public void stop() {
        System.out.println("the car stopped");
    }
    public void start() {
        System.out.println("the car started");
    }
    public void move() {
        System.out.println("The car is moving");
    }

}
