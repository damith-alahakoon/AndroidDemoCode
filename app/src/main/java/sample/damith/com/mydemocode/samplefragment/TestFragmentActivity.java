package sample.damith.com.mydemocode.samplefragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import sample.damith.com.mydemocode.R;

public class TestFragmentActivity extends AppCompatActivity {
    private TextView fragment_demo;
    private EditText activity_input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_fragment);
        activity_input=findViewById(R.id.activity_input);

//        Intent intent = getIntent();
//        String message = intent.getStringExtra("message");
//        fragment_demo=findViewById(R.id.fragment_demo);
//        fragment_demo.setText(message);
    }
    public void dataTofragment(View view){
        String fromActivity=activity_input.getText().toString();

//        Bundle bundle=new Bundle();
//        bundle.putString("message", fromActivity);
//        //set Fragmentclass Arguments
//        BottomFragment fragObj=new BottomFragment();
//        fragObj.setArguments(bundle);

    }
    public void showText(String topImageText, String bottomImageText) {
        BottomFragment fragObj=new BottomFragment();

        fragObj.showText(topImageText, bottomImageText);
    }
}
