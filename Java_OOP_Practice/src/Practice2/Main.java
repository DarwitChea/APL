package Practice2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> programmerobj = new ArrayList<Employee>();

Programmer programmer1 = new Programmer("Vireak","18243",700,"Java",23);
        programmerobj.add(programmer1);
        Programmer programmer2 = new Programmer("David","18212",650,"C++",20);
        programmerobj.add(programmer2);
        Programmer programmer3 = new Programmer("Vath","18266",600,"C#",17);
        programmerobj.add(programmer3);
        Manager manager1 = new Manager("Khoeline","18222",1000,"Development",5);
        programmerobj.add(manager1);

        Project project1 = new Project() {
            @Override
            public String getProjectName() {
                return "NICC Website";
            }

            @Override
            public double getBudget() {
                return 780;
            }
        };
        ProjectManager projectManager1= new ProjectManager(project1,programmerobj);
        System.out.println("Project name: " + project1.getProjectName());
        System.out.println("Project budget: " + project1.getBudget());
        System.out.println("Total salary: " + projectManager1.getTotalSalary());
        System.out.println("Bonus: " + projectManager1.calculateBonus());
    }
}
