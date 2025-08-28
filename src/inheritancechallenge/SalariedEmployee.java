package inheritancechallenge;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthday,
                            String hireDate, boolean isRetired,
                            double annualSalary) {
        super(name, birthday, hireDate);
        this.isRetired = isRetired;
        this.annualSalary = annualSalary;
    }

    public void retire() {
        this.isRetired = true;
        System.out.println(
          "Salaried Employee is retired!" + "thank you " + getName());
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + "annualSalary=" + annualSalary +
          ", isRetired=" + isRetired + "} " + super.toString();
    }
}
