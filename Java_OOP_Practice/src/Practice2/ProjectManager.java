package Practice2;

import java.util.ArrayList;

public class ProjectManager implements Project {
    public String projectName;
    public double budget;
    public Project project;
    public ArrayList<Employee> employeeObj;

    @Override
    public String getProjectName() {
        return projectName;
    }

    @Override
    public double getBudget() {
        return budget;
    }

    public ProjectManager(Project project, ArrayList<Employee> employeeObj) {
        this.project = project;
        this.employeeObj = employeeObj;
    }

    public double getTotalSalary() {
        double total = 0;
        for (int i = 0; i < employeeObj.size(); i++) {
            total += employeeObj.get(i).getSalary();
        }
        return total;
    }

    public double calculateBonus() {
        double bonus = 0;
        for (int i = 0; i < employeeObj.size(); i++) {
            bonus += (employeeObj.get(i).salary * 0.05);
        }
        return bonus;
    }

}
