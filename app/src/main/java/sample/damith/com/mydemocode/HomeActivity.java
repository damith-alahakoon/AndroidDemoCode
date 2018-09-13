package sample.damith.com.mydemocode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void inputValidation(View view){
        startActivity(new Intent(HomeActivity.this,ValidationActivity.class));
    }
    public void testJson(View view){
        startActivity(new Intent(HomeActivity.this,JsonRequestActivity.class));
    }
    public void testListView(View view){
        startActivity(new Intent(HomeActivity.this,ListViewActivity.class));
    }
    public void uploadFileVolly(View view){
        startActivity(new Intent(HomeActivity.this,UploadFileVollyActivity.class));
    }
    public void testQR(View view){
        startActivity(new Intent(HomeActivity.this,QRScanerActivity.class));
    }
    public void testFireBase(View view){
        startActivity(new Intent(HomeActivity.this,ValidationActivity.class));
    }
    public void testAsynTask(View view){
        startActivity(new Intent(HomeActivity.this,ValidationActivity.class));
    }
    public void testAlertBox(View view){
        startActivity(new Intent(HomeActivity.this,ValidationActivity.class));
    }
    public void testRadio(View view){
        startActivity(new Intent(HomeActivity.this,RadioBtnCheckBoxActivity.class));
    }
    public void saveLogs(View view){
        startActivity(new Intent(HomeActivity.this,LogFileActivity.class));
    }

}
