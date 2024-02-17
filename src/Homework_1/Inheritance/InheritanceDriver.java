package Homework_1.Inheritance;

public class InheritanceDriver {
    public static void main(String[] args){
        SalariedEmployee Joe = new SalariedEmployee(
                "Joe",
                "Jones",
                "111-11-1111"
        );
        Joe.setWeeklySalary(2500);
        Joe.printInfo();

        HourlyEmployee Stephanie = new HourlyEmployee(
                "Stephanie",
                "Smith",
                "222-22-2222"
        );
        Stephanie.setWage(25);
        Stephanie.setHoursWorked(32);
        Stephanie.printInfo();

        HourlyEmployee Mary = new HourlyEmployee(
                "Mary",
                "Quinn",
                "333-33-3333"
        );
        Mary.setWage(19);
        Mary.setHoursWorked(47);
        Mary.printInfo();

        CommisionEmployee Nicole = new CommisionEmployee(
                "Nicole",
                "Dior",
                "444-44-4444"
        );
        Nicole.setCommisionRate(0.15);
        Nicole.setGrossSales(50000);
        Nicole.printInfo();

        SalariedEmployee Renwa = new SalariedEmployee(
                "Renwa",
                "Chanel",
                "555-55-5555"
        );
        Renwa.setWeeklySalary(1700);
        Renwa.printInfo();

        BaseEmployee Mike = new BaseEmployee(
                "Mike",
                "Davenport",
                "666-66-6666"
        );
        Mike.setBaseSalary(95000);
        Mike.printInfo();

        CommisionEmployee Mahnaz = new CommisionEmployee(
                "Mahnaz",
                "Vaziri",
                "777-77-7777"
        );
        Mahnaz.setCommisionRate(0.22);
        Mahnaz.setGrossSales(40000);
        Mahnaz.printInfo();
    }
}
