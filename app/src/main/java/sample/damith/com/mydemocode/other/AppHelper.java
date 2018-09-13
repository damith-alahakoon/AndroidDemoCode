package sample.damith.com.mydemocode.other;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Environment;
import android.support.v4.content.ContextCompat;

import java.io.ByteArrayOutputStream;
import java.io.File;

public class AppHelper {
    /**
     * Turn drawable resource into byte array.
     *
     * @param context parent context
     * @param id      drawable resource id
     * @return byte array
     */
    public static byte[] getFileDataFromDrawable(Context context, int id) {
        Drawable drawable = ContextCompat.getDrawable(context, id);
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /**
     * Turn drawable into byte array.
     *
     * @param drawable data
     * @return byte array
     */
    public static byte[] getFileDataFromDrawable(Context context, Drawable drawable) {
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

//    public void openFile() {
//        File file = new File(Environment.getExternalStorageDirectory(),
//                "Report.pdf");
//        Uri path = Uri.fromFile(file);
//        Intent pdfOpenintent = new Intent(Intent.ACTION_VIEW);
//        pdfOpenintent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//        pdfOpenintent.setDataAndType(path, "application/pdf");
//        try
//
//        {
//            startActivity(pdfOpenintent);
//        } catch (ActivityNotFoundException e)
//
//        {
//
//        }
//    }
}
