package sample.damith.com.mydemocode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import sample.damith.com.mydemocode.customRecycler.RecyclerViewActivity;
import sample.damith.com.mydemocode.samplefragment.TestFragmentActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void inputValidation(View view){
        startActivity(new Intent(HomeActivity.this,CustomToastActivity.class));
    }
    public void testJson(View view){
        startActivity(new Intent(HomeActivity.this,JsonRequestActivity.class));
    }
    public void testListView(View view){
        startActivity(new Intent(HomeActivity.this,ListViewActivity.class));
    }
    public void testFragment(View view){
        startActivity(new Intent(HomeActivity.this,TestFragmentActivity.class));
    }
    public void uploadFileVolly(View view){
        startActivity(new Intent(HomeActivity.this,UploadFileVollyActivity.class));
    }
    public void testCalender(View view){
        startActivity(new Intent(HomeActivity.this,TestCalenderActivity.class));
    }
    public void testQR(View view){
        startActivity(new Intent(HomeActivity.this,QRScanerActivity.class));
    }
    public void generateQRBarcode(View view){
        startActivity(new Intent(HomeActivity.this,QRandBarcodeGenerateActivity.class));
    }
    public void testFireBase(View view){
        startActivity(new Intent(HomeActivity.this,CustomToastActivity.class));
    }
    public void testStyle(View view){
        startActivity(new Intent(HomeActivity.this,CustomStyleActivity.class));
    }
    public void testAsynTask(View view){
        startActivity(new Intent(HomeActivity.this,CustomToastActivity.class));
    }
    public void testAlertBox(View view){
        startActivity(new Intent(HomeActivity.this,AlertBoxActivity.class));
    }
    public void testRadio(View view){
        startActivity(new Intent(HomeActivity.this,RadioBtnCheckBoxActivity.class));
    }
    public void saveLogs(View view){
        startActivity(new Intent(HomeActivity.this,LogFileActivity.class));
    }
    public void intentType(View view){
        startActivity(new Intent(HomeActivity.this,IntenTypeActivity.class));
    }
    public void customToast(View view){
        startActivity(new Intent(HomeActivity.this,CustomToastActivity.class));
    }
    public void formValidation(View view){
        startActivity(new Intent(HomeActivity.this,FormValidationActivity.class));
    }
    public void bottomNaviBarTest(View view){
        startActivity(new Intent(HomeActivity.this,BottomNavigationBarActivity.class));
    }
    public void recylerTest(View view){
        startActivity(new Intent(HomeActivity.this,RecyclerViewActivity.class));
    }

}
