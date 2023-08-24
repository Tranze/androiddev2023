package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class WeatherActivity extends AppCompatActivity {
    private static final String TAG ="WeatherActivity";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_weather);
          //WeatherFragment firstFragment = new WeatherFragment();
          //getSupportFragmentManager().beginTransaction().add(R.id.weather_frag, firstFragment).commit();
          //ForecastFragment secondFragment = new ForecastFragment();
         //getSupportFragmentManager().beginTransaction().add(R.id.forecast_frag,secondFragment).commit();
        Log.i(TAG, "onCreate: This is a log message");
    }

    @Override
    protected void onResume() {

        super.onResume();
        Log.i(TAG, "onCreate: This is a log message");
    }

    @Override
    protected void onStart() {

        super.onStart();
        Log.i(TAG, "onCreate: This is a log message");
    }

    @Override
    protected void onStop() {

        super.onStop();
        Log.i(TAG, "onCreate: This is a log message");
    }
}