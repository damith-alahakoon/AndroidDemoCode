package sample.damith.com.mydemocode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class CustomToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cusom_toast);
        findViewById(R.id.btn_validation1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toasty.error(CustomToastActivity.this, "Error message", Toast.LENGTH_SHORT, true).show();
            }
        });
        findViewById(R.id.btn_validation2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toasty.success(CustomToastActivity.this, "success message", Toast.LENGTH_SHORT, true).show();
            }
        });
        findViewById(R.id.btn_validation3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toasty.info(CustomToastActivity.this, "info message", Toast.LENGTH_SHORT, true).show();
            }
        });
        findViewById(R.id.btn_validation4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toasty.warning(CustomToastActivity.this, "warning message", Toast.LENGTH_SHORT, true).show();
            }
        });
    }
}
