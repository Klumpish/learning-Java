package inheritancechallenge;

public class Employee extends Worker {
    private long employeeId;
    private String hireDate;
    //    will increase as we create more Employee's
    private static int employeeNo = 1;


    public Employee(String name, String birthday, String hireDate) {
        super(name, birthday);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;

    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeId=" + employeeId +
          ", hireDate='" + hireDate + '\'' + "} " + super.toString();
    }
}
