package sample.damith.com.mydemocode.other;

import android.content.Context;
import android.content.SharedPreferences;

public class MySharedPreferences {
    private static final String LOGIN = "LOGIN";

    public static String getLogin(Context context) {
        SharedPreferences sharedPref = context.getSharedPreferences("1", Context.MODE_PRIVATE);
        String login = sharedPref.getString(LOGIN, null);
        return login;
    }

    public static void setLogin(Context context, String login) {
        SharedPreferences.Editor editor = context.getSharedPreferences("1", Context.MODE_PRIVATE).edit();
        editor.putString(LOGIN, login);
        editor.apply();
    }
    ///////////////////

//    public static boolean setDefaultSecurityMethod(Context context, String security_type,int security_position){
//        SharedPreferences.Editor editor = context.getSharedPreferences(String.valueOf(R.string.register), Context.MODE_PRIVATE).edit();
//        editor.putString("securityType",security_type);
//        editor.putInt("security_position",security_position);
//        editor.apply();
//        return true;
//
//    }
//
//    public static String getDefaultSecurityMethod(Context context){
//        SharedPreferences sharedPref = context.getSharedPreferences(String.valueOf(R.string.register), Context.MODE_PRIVATE);
//        int refarance_position = sharedPref.getInt("security_position", 0);
//        String securityType=sharedPref.getString("securityType","");
//
//        return securityType;
//    }
}
