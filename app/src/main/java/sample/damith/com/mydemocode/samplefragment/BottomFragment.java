package sample.damith.com.mydemocode.samplefragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import sample.damith.com.mydemocode.R;

public class BottomFragment extends Fragment {
    private TextView valueTop, valueTop1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bottom, container, false);
        valueTop=view.findViewById(R.id.value_top);
        valueTop1=view.findViewById(R.id.value_top1);
//        try {
//            String strtext=getArguments().getString("message");
//
//            valueTop.setText(strtext);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        return view;
    }
    public void showText(String topImageText, String bottomImageText) {
        valueTop.setText(topImageText);
        valueTop1.setText(bottomImageText);
    }
}
