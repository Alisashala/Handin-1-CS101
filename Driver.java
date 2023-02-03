public class Driver {
    private String name;
    private int age;

//lavet constructor
    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void drive() {
        System.out.println("Lalita is driving");
    }

    //få navn og alder af driveren
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    //toString

}
