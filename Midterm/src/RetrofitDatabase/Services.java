package RetrofitDatabase;

import Model.ClassIT;
import Model.Response;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface Services {
    @GET("{id}/.json")
    Call<ClassIT> getFE
            (@Path("id") String ID);

    @POST(".json")
    Call<Response> createFE
            (@Body ClassIT fe);
}
