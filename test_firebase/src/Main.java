import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.*;

import java.io.FileInputStream;
import java.io.IOException;

public class EmployeeController {

    private static final String DATABASE_URL = "https://your-firebase-project.firebaseio.com/";
    private static final String SERVICE_ACCOUNT_KEY_PATH = "/path/to/serviceAccountKey.json";

    public static void main(String[] args) {
        // Initialize Firebase
        try {
            FileInputStream serviceAccount = new FileInputStream(SERVICE_ACCOUNT_KEY_PATH);

            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setDatabaseUrl(DATABASE_URL)
                    .setServiceAccount(serviceAccount)
                    .build();

            FirebaseApp.initializeApp(options);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // Get a reference to the Firebase Realtime Database
        DatabaseReference database = FirebaseDatabase.getInstance().getReference();

        // Query employee data
        DatabaseReference employeesRef = database.child("employees");

        // Add a listener for changes in the employee data
        employeesRef.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String previousChildKey) {
                Employee employee = dataSnapshot.getValue(Employee.class);
                System.out.println("New employee added: " + employee.getName());
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String previousChildKey) {
                Employee updatedEmployee = dataSnapshot.getValue(Employee.class);
                System.out.println("Employee data updated: " + updatedEmployee.getName());
            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {
                Employee removedEmployee = dataSnapshot.getValue(Employee.class);
                System.out.println("Employee removed: " + removedEmployee.getName());
            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String previousChildKey) {
                // Not implemented
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("Database error: " + databaseError.getMessage());
            }
        });
    }

    private static class Employee {
        private String name;
        private String position;
        private int salary;
        private String department;

        // Add getters and setters

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }
    }
}