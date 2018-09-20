package sample.damith.com.mydemocode.samplefragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import sample.damith.com.mydemocode.R;

public class TopFragment extends Fragment implements View.OnClickListener {
    private EditText name;
    private EditText age;
    private Button btn1;
    private TestFragmentActivity mainActivity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_top, container, false);
        name = view.findViewById(R.id.name);
        age = view.findViewById(R.id.age);

        btn1 = view.findViewById(R.id.submit);
        btn1.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        String uNeme = name.getText().toString();
        String userAge = age.getText().toString();


//        Toast.makeText(getContext(), "Fragment top :" + uNeme + "=" + userAge, Toast.LENGTH_SHORT).show();
//        Intent intent = new Intent(getActivity().getBaseContext(),
//                TestFragmentActivity.class);
//        intent.putExtra("message", uNeme);
//        getActivity().startActivity(intent);

        this.mainActivity.showText("888", "last");

    }
}
