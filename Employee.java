public class Employee {
    private String firstName;
    private String lastName;
    private double salary;


    //Add constructor that initializes the three instance variables
    //If the monthly salary is not positive, set it to 0.0.
    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;

        if (salary < 0) {
            setSalary(0.0);
        }

    }

    //Get attributes
    public String getFirstName ()  {
        return this.firstName;
    }
    public String getLastName ()  {
        return this.lastName;
    }
    public double getSalary ()  {
        return this.salary;
    }
    //Create two Employee objects and display each object’s yearly salary.
    public double getYearlySalary ()  {
        return this.salary * 12;
    }

    //If the monthly salary is not positive, set it to 0.0.
    public void setSalary (double salary) {
        this.salary = salary;
    }

    //toString metoden anvendt for at strukutere mine objekter
    @Override
    public String toString() {
        return "Employee {" +
                "first name = '" + firstName + '\'' +
                ", last name = " + lastName +
                ", Monthly salary = " + salary +
                '}';
    }

}
