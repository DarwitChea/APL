package Practice2;

public class Manager extends Employee{
    public String department;
    public double bonusPercentage;

    public Manager(String name, String employeeID, double salary, String department, double bonusPercentage) {
        super(name, employeeID, salary);
        this.department = department;
        this.bonusPercentage = bonusPercentage;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getBonusPercentage() {
        return bonusPercentage;
    }

    public void setBonusPercentage(double bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }
}
