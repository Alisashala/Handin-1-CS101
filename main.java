import java.util.Scanner;

public class main {

    // 1 - Define a method to find out if he/she is elligible to vote.
    public static void main(String[] args) {

        Scanner scanInt = new Scanner(System.in); //Scanneren bruges til at scanne/læse det tal som indsættes i inputfeltet
        System.out.println("Enter your age:");
        int age = scanInt.nextInt();

        if (age >= 18) {
            System.out.println("You can vote");
        }
        else {
            System.out.println("You are not eligible to vote");

    // 3 - Define a program to find out whether a given number is even or odd

            Scanner scanNumber = new Scanner(System.in);
            System.out.println("Choose a number:");
            int number = scanNumber.nextInt();

            if(number % 2 == 0) {
                System.out.println("the number is even");
            } else System.out.println("the number id odd");

    // 4 - Write a program that takes your full name as input and displays the abbreviations of the first and middle names except the last name which is displayed as it is.

            Scanner scanName = new Scanner(System.in);
            System.out.println("Enter your full name:");
            String fullName = scanName.nextLine();

            String[] name = fullName.split(" "); //String[] tager indputet/det fulde navn som et array, og splitter det via .split metoden
            String firstName = name[0].charAt(0) + ""; //Vi interagerer med hvert indeks/character i navnet via .chartAt metoden.
            String middleName = name[1].charAt(0) + "";
            String lastName = name[2];

            System.out.println(firstName + "." + middleName + "." + " " + lastName);
        }

        System.out.println("Maximum number is: " + maximun(10,24,56));
        System.out.println("Minimum number is: " + minimum(12,34,80));


    // 5 - Classes and objects:

    //Car & driver
        Driver person1 = new Driver("Lalita", 21);
        person1.drive();

        Car mercedes = new Car("Mercedes", 750000.00);
        mercedes.stop();
        mercedes.start();
        mercedes.move();


    //Employee
        Employee employee1 = new Employee("Bente", "Hansen", -39.0);
        Employee employee2 = new Employee("Birgitte", "Larsen", 43500.00);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println("Bentes yearly salary is: " + employee1.getYearlySalary());
        System.out.println("Birgittes yearly salary is: " + employee2.getYearlySalary());
        //10% raise in salary
        System.out.println(employee1.getYearlySalary() * 1.1);
        System.out.println(employee2.getYearlySalary() * 1.1);

    }

    // 2 - Define two methods to print the maximum and the minimum number respectively among three numbers
    public static int maximun(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
    public static int minimum(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }


}