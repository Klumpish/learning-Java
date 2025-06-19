public class Main {
    public static void main(String[] args) {
        Worker tommy = new Worker("Tommy", "1989");
        System.out.println(tommy);


        SalariedEmployee sissy = new SalariedEmployee("Sissy", "2002",
          "1/3/23", false, 400);
        System.out.println(sissy);
        sissy.retire();

        HourlyEmployee bob = new HourlyEmployee("Bob", "1978",
          "31/9/24", 99);
        System.out.println(bob);


        createHourlyEmployee();
    }

    public static void createHourlyEmployee() {
        HourlyEmployee name = new HourlyEmployee("Nikky", "1978",
          "31/9/24", 663);
        System.out.println("age " + name.getAge());
        System.out.println("collects " + name.collectPay());
        name.getDoublePay();
    }
}
