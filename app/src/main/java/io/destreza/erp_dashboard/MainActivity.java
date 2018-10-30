package io.destreza.erp_dashboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import io.destreza.erp_dashboard.Model.ApiInterface;
import io.destreza.erp_dashboard.Model.Retrofit_Inits;
import io.destreza.erp_dashboard.Model.Users;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private static final String LOGIN_BASE_URL="https://login.jomakhata.com/";
    private static final String USER_INFO_BASE_URL="https://www.jomakhata.com/";
    private ApiInterface apiInterface;
    private Button loginBtn;
    private EditText uEmailET,uPassET;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initsAll();
        actionListener();
    }



    private void initsAll() {
        loginBtn=findViewById(R.id.loginBtn);
        uEmailET=findViewById(R.id.uEmail);
        uPassET=findViewById(R.id.uPass);
    }
    private void actionListener() {
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(MainActivity.this,WelcomePage.class));
                String userEmail=uEmailET.getText().toString().trim();
                String userPass=uPassET.getText().toString().trim();
                if(!userEmail.isEmpty() && !userPass.isEmpty())
                    loginUser(userEmail,userPass);
                    //Toast.makeText(MainActivity.this, "jkldsjf", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Please enter email and password!!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void loginUser(String userEmail, String userPass) {
        //initialize of retrofit


        /*apiInterface=Retrofit_Inits.getRetrofitInits(LOGIN_BASE_URL).create(ApiInterface.class);

        apiInterface.createUser(userEmail,userPass,1,"").enqueue(new Callback<Users>() {
            @Override
            public void onResponse(Call<Users> call, Response<Users> response) {
                if(response.isSuccessful())
                {
                    Toast.makeText(MainActivity.this, "Key is "+response.body().getKey(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Users> call, Throwable t) {
                Toast.makeText(MainActivity.this, ""+t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

        */

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(LOGIN_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiInterface = retrofit.create(ApiInterface.class);


        apiInterface.createUser("fahadbillah@yahoo.com", "123", 1, "").enqueue(new Callback<Users>() {
            @Override
            public void onResponse(Call<Users> call, Response<Users> response) {
                if(response.isSuccessful())
                {
                    Toast.makeText(MainActivity.this, ""+response.body().getKey(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Users> call, Throwable t) {

            }
        });
    }
}
