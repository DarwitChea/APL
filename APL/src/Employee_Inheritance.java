package Assignment_03_Inheritance;

public class Employee_Inheritance {
    public static abstract class Person{
        String firstName;
        String lastName;
        String height;

        public Person() {}

        public Person(String firstName, String lastName, String height){
            this.firstName = firstName;
            this.lastName = lastName;
            this.height = height;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getHeight() {
            return height;
        }

        public void setHeight(String height) {
            this.height = height;
        }

    }

    public static class Employee extends Person {
        private int iD;
        private double hourlyPay;
        private int work;

        public Employee(String firstName, String lastName, String height, int iD,double hourlyPay,int work){
            super(firstName, lastName, height);
            this.iD = iD;
            this.hourlyPay = hourlyPay;
            this.work = work;
        }

        public int getiD() {
            return iD;
        }

        public void setiD(int iD) {
            this.iD = iD;
        }

        public double getHourlyPay() {
            return hourlyPay;
        }

        public void setHourlyPay(double hourlyPay) {
            this.hourlyPay = hourlyPay;
        }

        public int getWork() {
            return work;
        }

        public void setWork(int work) {
            this.work = work;
        }

        double getRaise(double hourlyPay){
            hourlyPay = hourlyPay * 0.15;
            return (double) hourlyPay;
        }

        double payDay(int work,double hourlyPay){
            double overtime,pay;
            if(work > 40){
                overtime = work - 40;
                pay = (overtime* (1.5 * hourlyPay)) + (40 * hourlyPay);
            }
            else{
                pay = 40 * hourlyPay;
            }
            return pay;
        }

        @Override
        public String toString() {
            return "Employee: " +
                    "\nName: " + firstName + ' ' + lastName +
                    "\nThey are " + height + "m tall." +
                    "\nThey make " + hourlyPay + "$/h" +
                    "\nThey have the employee iD number: " + iD +
                    "\nThey work for " + work + "h a week." +
                    "\nTheir weekly payment is " + payDay(this.work,this.hourlyPay);
        }

        @Override
        public boolean equals(Object obj) {
            if(obj == this){
                return true;
            }
            if(!(obj instanceof Employee)) {
                return false;
            }
            Employee emp = (Employee) obj;
            return this.iD == emp.iD && this.lastName.equals(emp.lastName);
        }
    }

    public static void main(String[] args) {

        Employee employee1 = new Employee("David", "Chea","1.70",1,10,45);
        Employee employee2 = new Employee("Lor", "Chea","1.70",2,15,40);

        System.out.println(employee1);
        System.out.println("\nAre the 2 employee the same? " + employee1.equals(employee2));
    }
}
