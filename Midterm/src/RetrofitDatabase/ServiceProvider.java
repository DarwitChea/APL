package RetrofitDatabase;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceProvider {
    public static Services getServiceProvider(String URL)
    {
        return new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory
                        (GsonConverterFactory.create())
                .build().create(Services.class);
    }
}
