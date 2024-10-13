package Practice2;

public class Programmer extends Employee{
    public String programmingLanguage;
    public double hourlyRate;

    public Programmer(String name, String employeeID, double salary, String programmingLanguage, double hourlyRate) {
        super(name, employeeID, salary);
        this.programmingLanguage = programmingLanguage;
        this.hourlyRate = hourlyRate;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
