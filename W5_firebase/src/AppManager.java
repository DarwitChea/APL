import Model.FEITE;
import Model.Response;
import Model.Student;
import Model.Teacher;
import RetrofitDatabase.ServiceProvider;
import retrofit2.Call;
import retrofit2.Callback;

import java.util.ArrayList;

public class AppManager {
    static String URL ="https://fir-ea51a-default-rtdb.asia-southeast1.firebasedatabase.app/";
    public static void main(String[] a)
    {
        FEITE feer = new FEITE();
        feer.className ="M5 ITE";
        ArrayList<Student> objStudent = new ArrayList<Student>();
        objStudent.add(new Student(100,50.5f));
        objStudent.add(new Student(102,45.5f));
        feer.student = objStudent;

        ArrayList<Teacher> objTeacher = new ArrayList<Teacher>();
        objTeacher.add(new Teacher("Teacher 1","Java"));
        objTeacher.add(new Teacher("Teacher 2","C#"));
        feer.teacher = objTeacher;

        CreateITE(feer);
        String ID = "-NTgRiji3WretN_o7Av1";

        getITE(ID);
    }
    public static void CreateITE(FEITE obj)
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
        Call<FEITE> call = ServiceProvider
                .getServiceProvider(URL)
                .getFE(ID);
        call.enqueue(new Callback<FEITE>() {
            @Override
            public void onResponse(Call<FEITE> call, retrofit2.Response<FEITE> response) {
                FEITE obj = response.body();
                System.out.print(obj.teacher.get(0).name);
            }

            @Override
            public void onFailure(Call<FEITE> call, Throwable throwable) {

            }
        });
    }
}
