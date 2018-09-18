package sample.damith.com.mydemocode;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.ImageView;

import net.glxn.qrgen.android.QRCode;

public class QRandBarcodeGenerateActivity extends AppCompatActivity {
    private ImageView qr_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qrand_barcode_generate);
        qr_view=findViewById(R.id.qr_view);
        qrGeneration();
    }
    public  void qrGeneration(){
        String code = "Qr_" +"1234";  //String code for qr
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int width_px = Resources.getSystem().getDisplayMetrics().widthPixels;
        int height_px = Resources.getSystem().getDisplayMetrics().heightPixels;

        int pixeldpi = Resources.getSystem().getDisplayMetrics().densityDpi;
        float pixeldp = Resources.getSystem().getDisplayMetrics().density;

        int width_dp = (width_px / pixeldpi) * 160;
        int height_dp = (height_px / pixeldpi) * 160;

        Bitmap myBitmap = QRCode.from("" + code).withSize(width_px, width_px).bitmap();

        qr_view.setImageBitmap(myBitmap);

    }
}
