package sample.damith.com.mydemocode;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class JsonRequestActivity extends AppCompatActivity {
    //private String urlJsonArry = "https://api.androidhive.info/volley/person_array.json";
    private String TAG = "JsonRequestActivity";
    private TextView txtResponse;
    private ProgressDialog pDialog;
    private JSONArray result;

    // temporary string to show the parsed response
    private String jsonResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json_request);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        txtResponse = (TextView) findViewById(R.id.txtResponse);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        pDialog = new ProgressDialog(this);
        pDialog.setMessage("Please wait...");
        pDialog.setCancelable(false);
    }

    public void readJsonArray(View view) {
        makeJsonObjectRequest();
    }

    private void makeJsonObjectRequest() {
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        try {
            JSONObject jsonBody = new JSONObject();

            jsonBody.put("terminalId", "POCMBC01");
            Log.d("request_login ", String.valueOf(jsonBody));


            JsonObjectRequest stringRequest = new JsonObjectRequest(Request.Method.POST, "http://52.15.177.150/pos/public/checkLogUpdate", jsonBody,
                    new Response.Listener<JSONObject>() {
                        @Override
                        public void onResponse(JSONObject response) {
                            Log.d("main", "response:------------------------------- ");
                            Log.d("main", "response: " + response);
                            JSONObject j = null;
                            try {

                                //  j = new JSONObject(response);

                                result = j.getJSONArray("true");

                                getBusinessType(result);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    },
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {

                        }
                    });

            //Creating a request queue
            requestQueue.add(stringRequest);
        } catch (JSONException e) {
            e.printStackTrace();

        }

    }

    private void getBusinessType(JSONArray j) {
        //Traversing through all the items in the json array

        for (int i = 0; i < j.length(); i++) {
            try {
                JSONObject json = j.getJSONObject(i);

                //  bussinessType.add(json.getString("name"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

    }

    private void JsonObjectRequse() {

        RequestQueue requestQueue = Volley.newRequestQueue(JsonRequestActivity.this);
        try {
            JSONObject jsonBody = new JSONObject();
            String URL = "https://";

//        jsonBody.put("first_name", bdFirstName);
//        jsonBody.put("surname", bdSurname);
//        jsonBody.put("dob", bdDob);
//        jsonBody.put("nic", bdNic);
//        jsonBody.put("gender", gender);
//        jsonBody.put("residential_address", bdResidentialAddress);


            Log.d("jsonBody: ", jsonBody.toString());

            JsonObjectRequest jsonObjReq
                    = new JsonObjectRequest(Request.Method.POST, URL, jsonBody,
                    new Response.Listener<JSONObject>() {

                        @Override
                        public void onResponse(JSONObject response) {

                            Log.d("LOG_Json Response", response.toString());

                            //Read json response
                            if (response.has("success")) {

                                JSONObject jsonObject = (JSONObject) response.opt("success");

                                try {

                                    Log.d("LOG_Json Response", "userID: " + jsonObject.getString("first_name"));


                                    Intent intent = new Intent(JsonRequestActivity.this, HomeActivity.class);
                                    startActivity(intent);
                                    finish();

                                } catch (JSONException e1) {
                                    e1.printStackTrace();

                                }
                            }

                        }
                    }, new Response.ErrorListener() {

                @Override
                public void onErrorResponse(VolleyError error) {
                    VolleyLog.d("TAG", "Error: " + error.getMessage());
                    Log.d(" _request_error", "onErrorResponse() called with: error = [" +
                            error + "]");
                }

            }) {

                @Override
                public Map<String, String> getHeaders() throws AuthFailureError {
                    HashMap<String, String> headers = new HashMap<String, String>();
                    headers.put("Content-Type", "application/json; charset=utf-8");
                    return headers;
                }
            };

            jsonObjReq.setTag("TAG");

            Log.d("basic_details", "sending.." + jsonBody.toString());

            jsonObjReq.setRetryPolicy(new DefaultRetryPolicy(
                    300000,
                    DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
                    DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));

            // Adding request to request queue
            requestQueue.add(jsonObjReq);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
