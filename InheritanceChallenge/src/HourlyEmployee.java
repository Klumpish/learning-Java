public class HourlyEmployee extends Employee {
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthday,
                          String hireDate, double hourlyPayRate) {
        super(name, birthday, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public void getDoublePay() {
        System.out.println(
          getName() + " is getting double pay " + this.hourlyPayRate +
            " becomes " + (this.hourlyPayRate * 2));
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + "hourlyPayRate=" + hourlyPayRate +
          "} " + super.toString();
    }
}
