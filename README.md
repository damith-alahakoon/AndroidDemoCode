# AndroidDemoCode
My demo codes
================================================================
android Basic code

===========================
   <View style="@style/op_view" />
===========================
<style name="op_view">
        <item name="android:background">@color/white</item>
        <item name="android:layout_width">fill_parent</item>
        <item name="android:layout_height">2dp</item>
    </style> <style name="op_normal_text_style">
        <item name="android:textSize">16sp</item>
        <item name="android:fontFamily">Swiss721BT-Light</item>
        <item name="android:textColor">@color/white</item>
  -----------------------------------
  ===============================================
      android:background="@drawable/buttonpresscolor"
  =====================================
  <?xml version="1.0" encoding="utf-8"?>
<selector xmlns:android="http://schemas.android.com/apk/res/android">
<item android:state_pressed="true" >
    <shape>
        <solid
            android:color="@color/colorPrimaryDark" />
        <stroke
            android:width="1dp"
            android:color="@color/btn_bottominmain" />

        <padding
            android:left="10dp"
            android:top="10dp"
            android:right="10dp"
            android:bottom="10dp" />
    </shape>
</item>
<item>
    <shape>
        <gradient
            android:startColor="@android:color/transparent"
            android:endColor="@android:color/transparent"
            android:angle="270" />

        <padding
            android:left="10dp"
            android:top="10dp"
            android:right="10dp"
            android:bottom="10dp" />
    </shape>
</item>
</selector>
===============================


