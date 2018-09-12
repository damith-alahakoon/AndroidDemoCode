package sample.damith.com.mydemocode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import sample.damith.com.mydemocode.other.LogFileHandler;

public class LogFileActivity extends AppCompatActivity {
    private EditText inputName;
    LogFileHandler logData = new LogFileHandler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_file);
        logData.appendLog("Start activity", "Logout", true);
        inputName = findViewById(R.id.name_input);
    }

    public void testLogData(View view) {
        String inputData = inputName.getText().toString();

        logData.appendLog("Savedata", inputData, true);
        Toast.makeText(this, "save "+inputData, Toast.LENGTH_SHORT).show();
    }

}
