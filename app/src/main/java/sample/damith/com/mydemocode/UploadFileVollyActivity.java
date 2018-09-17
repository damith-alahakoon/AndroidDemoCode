package sample.damith.com.mydemocode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.android.volley.NetworkResponse;
import com.android.volley.NoConnectionError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import sample.damith.com.mydemocode.other.AppHelper;
import sample.damith.com.mydemocode.other.VolleyMultipartRequest;
import sample.damith.com.mydemocode.other.VolleySingleton;

public class UploadFileVollyActivity extends AppCompatActivity {
    ImageView mAvatarImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_file_volly);

        mAvatarImage =  findViewById(R.id.imageView1);
    }

    protected void uploadFile(View view) {
        saveProfileAccount();

    }

    private void saveProfileAccount() {
        // loading or check internet connection or something...
        // ... then
        String url = "http://52.15.177.150/pos/public/pullLogs";
        VolleyMultipartRequest multipartRequest = new VolleyMultipartRequest(Request.Method.POST, url, new Response.Listener<NetworkResponse>() {
            @Override
            public void onResponse(NetworkResponse response) {
                String resultResponse = new String(response.data);
                try {
                    // JSONObject result = new JSONObject(resultResponse);
                    JSONArray result = new JSONArray(resultResponse);
                    String status = result.getString(0);
                    Log.i("Messsage", status);
//                    String message = result.getString("message");

//                    if (status.equals(Constant.REQUEST_SUCCESS)) {
//                        // tell everybody you have succed upload image and post strings
//                        Log.i("Messsage", message);
//                    } else {
//                        Log.i("Unexpected", message);
//                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                NetworkResponse networkResponse = error.networkResponse;
                String errorMessage = "Unknown error";
                if (networkResponse == null) {
                    if (error.getClass().equals(TimeoutError.class)) {
                        errorMessage = "Request timeout";
                    } else if (error.getClass().equals(NoConnectionError.class)) {
                        errorMessage = "Failed to connect server";
                    }
                } else {
                    String result = new String(networkResponse.data);
                    try {
                        JSONObject response = new JSONObject(result);
                        String status = response.getString("status");
                        String message = response.getString("message");

                        Log.e("Error Status", status);
                        Log.e("Error Message", message);

                        if (networkResponse.statusCode == 404) {
                            errorMessage = "Resource not found";
                        } else if (networkResponse.statusCode == 401) {
                            errorMessage = message + " Please login again";
                        } else if (networkResponse.statusCode == 400) {
                            errorMessage = message + " Check your inputs";
                        } else if (networkResponse.statusCode == 500) {
                            errorMessage = message + " Something is getting wrong";
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                Log.i("Error", errorMessage);
                error.printStackTrace();
            }
        }) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<>();
                params.put("terminalId", "POCMBC01");
                //  params.put("name", mNameInput.getText().toString());

                return params;
            }

            @Override
            protected Map<String, DataPart> getByteData() {
                Map<String, DataPart> params = new HashMap<>();
                // file name could found file base or direct access from real path
                // for now just get bitmap data from ImageView
                SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
                String day = s.format(new Date());
                File logFile = new File("sdcard/data/log-"+day+".log");

              //  params.put("file", new DataPart("log-"+day+".log",logFile, "image/jpeg"));
              params.put("avatar", new DataPart("log-"+day+".log", AppHelper.getFileDataFromDrawable(getBaseContext(), mAvatarImage.getDrawable()), "text/pain"));


                return params;
            }
        };

        VolleySingleton.getInstance(getBaseContext()).addToRequestQueue(multipartRequest);
    }
}
