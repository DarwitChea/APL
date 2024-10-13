package RetrofitDatabase;

import Model.FEITE;
import Model.Response;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface Services {
    @GET("{id}/.json")
    Call<FEITE> getFE
            (@Path("id") String ID);

    @POST(".json")
    Call<Response> createFE
            (@Body FEITE fe);
}
