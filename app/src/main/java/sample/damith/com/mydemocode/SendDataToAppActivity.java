package sample.damith.com.mydemocode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SendDataToAppActivity extends AppCompatActivity {
    private EditText userNameSend;
    private EditText passwordSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_data_to_app);
        userNameSend=findViewById(R.id.user_name_send);
        passwordSend=findViewById(R.id.user_password_send);
    }
    public void passingDataToApp(View view){
        String userNamePass= userNameSend.getText().toString();
        String passwordPass=passwordSend.getText().toString();
        Toast.makeText(this, "Data Passing to App :"+userNamePass+"-"+passwordPass, Toast.LENGTH_SHORT).show();
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
        sendIntent.putExtra("UNAME",userNamePass);
        sendIntent.putExtra("UPWD",passwordPass);
        sendIntent.setType("text/plain");
        startActivity(Intent.createChooser(sendIntent, getResources().getText(R.string.send_to)));
    }
}
