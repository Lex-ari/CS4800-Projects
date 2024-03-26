package Homework_1.Inheritance;

public class Employee {
    protected String firstName;
    protected String lastName;
    protected String ssid;

    public Employee() {

    }

    public Employee(String firstName, String lastName, String ssid) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssid = ssid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String newName) {
        firstName = newName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String newName) {
        lastName = newName;
    }

    public String getSSID() {
        return ssid;
    }

    public void setSSID(String newSSID) {
        ssid = newSSID;
    }

    protected String getInfo() {
        return String.format("First Name: %s, Last Name: %s, SSID: %s", firstName, lastName, ssid);
    }

    public void printInfo() {
        System.out.println(getInfo());
    }
}

class SalariedEmployee extends Employee {
    private double weekly_salary;

    public SalariedEmployee(String firstName, String lastName, String ssid) {
        super(firstName, lastName, ssid);
    }

    public double getWeeklySalary() {
        return weekly_salary;
    }

    public void setWeeklySalary(double weekly_salary) {
        this.weekly_salary = weekly_salary;
    }

    @Override
    protected String getInfo() {
        return super.getInfo() + String.format(", Weekly Salary: %.2f", weekly_salary);
    }
}

class HourlyEmployee extends Employee {
    private double wage;
    private double hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String ssid) {
        super(firstName, lastName, ssid);
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    protected String getInfo() {
        return super.getInfo() + String.format(", Wage: %.2f, Hours worked: %.2f", wage, hoursWorked);
    }
}

class CommisionEmployee extends Employee {
    private double commisionRate;
    private double grossSales;

    public CommisionEmployee(String firstName, String lastName, String ssid) {
        super(firstName, lastName, ssid);
    }

    public double getCommisionRate() {
        return commisionRate;
    }

    public void setCommisionRate(double commisionRate) {
        this.commisionRate = commisionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    protected String getInfo() {
        return super.getInfo() + String.format(", Com Rate: %.2f, Gross Salary: %.2f", commisionRate, grossSales);
    }
}

class BaseEmployee extends Employee {
    private double baseSalary;

    public BaseEmployee(String firstName, String lastName, String ssid) {
        super(firstName, lastName, ssid);
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    protected String getInfo() {
        return super.getInfo() + String.format(", Base Salary: %.2f", baseSalary);
    }
}
