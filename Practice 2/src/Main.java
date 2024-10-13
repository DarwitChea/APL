import javax.lang.model.type.ArrayType;
import java.util.ArrayList;

public class Main {

    public static class Employee{
        String name,iD;
        Double salary;

        public Employee(String name, String iD, Double salary) {
            this.name = name;
            this.iD = iD;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getiD() {
            return iD;
        }

        public void setiD(String iD) {
            this.iD = iD;
        }

        public Double getSalary() {
            return salary;
        }

        public void setSalary(Double salary) {
            this.salary = salary;
        }

        double calculateBonus(){
            double bonus = 0.1 * this.salary;
            return bonus;
        }
    }

    public static class Manager extends Employee{
        String department;
        Double bonusPercent;

        public Manager(String name, String iD, Double salary) {
            super(name, iD, salary);
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public Double getBonusPercent() {
            return bonusPercent;
        }

        public void setBonusPercent(Double bonusPercent) {
            this.bonusPercent = bonusPercent;
        }
    }

    public static class Programmer extends Employee{
        String programLanguage;
        Double hourlyRate;

        public Programmer(String name, String iD, Double salary) {
            super(name, iD, salary);
        }

        public String getProgramLanguage() {
            return programLanguage;
        }

        public void setProgramLanguage(String programLanguage) {
            this.programLanguage = programLanguage;
        }

        public Double getHourlyRate() {
            return hourlyRate;
        }

        public void setHourlyRate(Double hourlyRate) {
            this.hourlyRate = hourlyRate;
        }
    }

    public interface Project{
        String getProjectName();
        Double getBudget();
    }

    public static class ProjectManger{
        Project objProject;
        ArrayList<Employee> employees = new ArrayList<Employee>();

        public ProjectManger(Project objProject, ArrayList<Employee> employees) {
            this.objProject = objProject;
            this.employees = employees;
        }

        double getTotalSalary(){
            double totalSalary = 0;
            for(int i = 0; i < employees.size();i++){
                totalSalary += employees.get(i).getSalary();
            }
            return totalSalary;
        }

        double getBudget() {
            return objProject.getBudget();
        }

        String getProjectName(){
            return objProject.getProjectName();
        }

        double calculateBonus(){
            double totalBonus = 0;
            for(int i = 0; i < employees.size();i++){
                totalBonus += employees.get(i).calculateBonus() * 0.05;
            }
            return totalBonus;
        }

        @Override
        public String toString() {
            return "Project name: " + this.getProjectName() +
                    "\nProject budget: " + this.getBudget() +
                    "\nTotal Salary: " + this.getTotalSalary() +
                    "\nTotal bonus: " + this.calculateBonus();
        }
    }

    public static void main(String[] args) {

        Manager objManager = new Manager("De","2003",200.0);
        Programmer objProgrammer = new Programmer("Da","2004",200.0);
        Project objProject = new Project(){

            @Override
            public String getProjectName() {
                return "Project A";
            }

            @Override
            public Double getBudget() {
                return 1000.0;
            }
        };

        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(objProgrammer);
        employees.add(objManager);

        ProjectManger objProjectManager = new ProjectManger(objProject,employees);

//        System.out.println("Project name: " + objProject.getProjectName());
//        System.out.println("Project budget: " + objProject.getBudget());
//        System.out.println("Total Salary: " + objProjectManager.getTotalSalary());
//        System.out.println("Total bonus: " + objProjectManager.calculateBonus());

        System.out.println(objProjectManager.toString());
    }
}