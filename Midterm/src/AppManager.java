import Model.*;
import RetrofitDatabase.ServiceProvider;
import retrofit2.Call;
import retrofit2.Callback;

import java.util.ArrayList;

public class AppManager {
    static String URL ="https://midterm-cc80b-default-rtdb.asia-southeast1.firebasedatabase.app/";
    public static void main(String[] a)
    {
        ClassIT classM1 = new ClassIT();
        classM1.className ="ITE M1";
        ArrayList<Student> objStudent = new ArrayList<Student>();
        ArrayList<Subject> objSubject1 = new ArrayList<Subject>();
        ArrayList<Subject> objSubject2 = new ArrayList<Subject>();


        objSubject1.add(new Subject("APL",new Score(10,20,30,40)));
        objSubject1.add(new Subject("Database",new Score(20,30,10,20)));
        objSubject1.add(new Subject("DSA",new Score(10,30,10,10)));
        objStudent.add(new Student("David", 10, 0, objSubject1));

        objSubject2.add(new Subject("APL",new Score(30,20,10,40)));
        objSubject2.add(new Subject("APL",new Score(20,10,40,10)));
        objSubject2.add(new Subject("APL",new Score(25,15,10,11)));
        objStudent.add(new Student("Heng",10,1, objSubject2));
        classM1.student = objStudent;

//        ArrayList<Teacher> objTeacher = new ArrayList<Teacher>();
//        objTeacher.add(new Teacher("Teacher 1","Java"));
//        objTeacher.add(new Teacher("Teacher 2","C#"));
//        classM1.teacher = objTeacher;

        CreateITE(classM1);
        String ID = "-NTgRiji3WretN_o7Av1";

        getITE(ID);
        System.out.print(objStudent.toString());
    }
    public static void CreateITE(ClassIT obj)
    {
        Call<Response> call = ServiceProvider
                .getServiceProvider(URL)
                .createFE(obj);
        call.enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                Response result = response.body();
                System.out.print("Result : "+ result.name);
            }

            @Override
            public void onFailure(Call<Response> call, Throwable throwable) {
                System.out.print("Failure : "+throwable.toString());
            }
        });
    }
    public static void getITE(String ID)
    {
        Call<ClassIT> call = ServiceProvider
                .getServiceProvider(URL)
                .getFE(ID);
        call.enqueue(new Callback<ClassIT>() {
            @Override
            public void onResponse(Call<ClassIT> call, retrofit2.Response<ClassIT> response) {
                ClassIT obj = response.body();
//                System.out.print(obj.teacher.get(0).name);
            }

            @Override
            public void onFailure(Call<ClassIT> call, Throwable throwable) {

            }
        });
    }
}
