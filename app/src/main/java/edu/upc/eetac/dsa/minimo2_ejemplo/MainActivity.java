package edu.upc.eetac.dsa.minimo2_ejemplo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme); //Importantissiimooo
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //If login activity closed means the user has logged in, and the data is stored in the database
        if (requestCode == 1) {
            if(resultCode == Activity.RESULT_OK){
                Log.w("s","Test");
                //User Logged In

            }
            if (resultCode == Activity.RESULT_CANCELED) {
                //Not Possible due to the fact Login is a must
            }

        }

    }
}
