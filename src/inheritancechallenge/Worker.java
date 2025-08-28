package inheritancechallenge;

public class Worker {
    private String name;
    private String birthday;
    //    making endDate protected because we might change that later
    protected String endDate;

    public Worker(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;

    }

    public int getAge() {
        int age = 2025 - Integer.parseInt(this.birthday);
        return age;
    }

    public double collectPay() {
        return 101.2;
    }

    public String terminate(String endDate) {
        this.endDate = endDate;
        return "Terminating " + this.name + " at " + this.endDate;

    }

    @Override
    public String toString() {
        return "Worker{" + "name='" + name + '\'' + ", birthday='" +
          birthday + '\'' + "(" + getAge() + ")" + ", endDate='" +
          endDate + '\'' + '}';

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
