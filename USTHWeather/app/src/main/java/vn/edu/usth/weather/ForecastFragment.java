package vn.edu.usth.weather;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class ForecastFragment extends Fragment {
    public ForecastFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_forecast, container, false);
        v.setBackgroundColor(0x20FF0000);
        LinearLayout linearLayout = v.findViewById(R.id.linearlayout);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        TextView textView = new TextView(getContext());
        textView.setText("Thursday");
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.cloudy_sunny);
        linearLayout.addView(textView);
        linearLayout.addView(imageView);
        return v;

        /*
        View v = super.onCreateView(inflater, container, savedInstanceState);
        v.setBackgroundColor(0xFF00FF00);
        LinearLayout rootViewGroup = new LinearLayout(getActivity());
        rootViewGroup.setBackgroundColor(Color.parseColor("#ffff00"));
        rootViewGroup.setOrientation(LinearLayout.VERTICAL);
        return rootViewGroup;
         */
    }
}