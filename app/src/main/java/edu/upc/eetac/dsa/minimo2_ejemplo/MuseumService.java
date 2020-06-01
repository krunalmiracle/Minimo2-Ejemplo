package edu.upc.eetac.dsa.minimo2_ejemplo;

import java.util.List;
import edu.upc.eetac.dsa.minimo2_ejemplo.models.Museums;
import retrofit2.Call;
import retrofit2.http.GET;

public interface MuseumService {

    @GET("api/dataset/museus/format/json/pag-ini/")
    Call<Museums> getMuseums();
}
