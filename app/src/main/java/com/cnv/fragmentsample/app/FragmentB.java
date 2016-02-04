package com.cnv.fragmentsample.app;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentB extends Fragment {
    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        textView = (TextView) view.findViewById(R.id.textView);
        return view;
    }

    public void changeData(int index) {
        String[] descriptions = getResources().getStringArray(R.array.description);
        textView.setText(descriptions[index]);
    }
}
