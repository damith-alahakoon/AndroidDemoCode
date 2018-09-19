package sample.damith.com.mydemocode;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;

public class TestCalenderActivity extends AppCompatActivity {
    private Chronometer chronometer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_calender);
         chronometer = findViewById(R.id.chronometer);
    }
    public void startChronometer(View view){
        chronometer.start();

    }
    public void stopChronometer(View view){
       // chronometer.stop();

    }
    public void restartChronometer(View view){
        long systemCurrTime = SystemClock.elapsedRealtime();
        chronometer.setBase(systemCurrTime);

    }
}
