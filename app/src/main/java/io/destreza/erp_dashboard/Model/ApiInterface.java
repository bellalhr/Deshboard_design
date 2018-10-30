package io.destreza.erp_dashboard.Model;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface ApiInterface {
    @FormUrlEncoded
    @POST("login/set_jwt_data")
    Call<Users> createUser(@Field("username") String username,@Field("password") String pass,@Field("remember") int remamber,@Field("url_redirec") String url_redir);


}
